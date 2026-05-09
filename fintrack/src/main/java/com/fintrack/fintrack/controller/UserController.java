package com.fintrack.fintrack.controller;

//Importa a entidade do pacote Model
import com.fintrack.fintrack.model.User;
//Importa o UserService do pacote service
import  com.fintrack.fintrack.service.UserService;
//Diz ao Spring: essa classe é um Controller
import org.springframework.stereotype.Controller;
// @GetMapping = mapeia requisições GET( acessar página)
import org.springframework.web.bind.annotation.GetMapping;
//@PostMapping = mapeia requisições POST (enviar formulário)
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

@Controller
// Marca a classe como Controler - Spring passa a gerencia-lo
public class UserController {

    // Declara dependência do User Service
    // private = só essa classe acessa
    // final = não muda depois de criado
    private final UserService userService;

    //Construtor - Spring injeta o UserService auotomaticamente aqui
    // Quando o Spring criar o Controller, ele já entrega o Service pronto
    public UserController(UserService userService){
        this.userService = userService;
    }


    // @GetMapping = quando o usuário ACESSAR essa URL no navegador
    // "/usuarios/novo" = http://localhost:8081/usuarios/novo
    @GetMapping("/usuarios/novo")
    public String mostrarFormulario(Model model){
        // passa um User vazio para o formulário
        // o Thymeleaf usa esse objeto para mapear os th:field
        model.addAttribute("user",new User());
        return "usuarios/novo";
        //Retorna o nome do HTML
    }
    // @PostMapping = quando o usuário ENVIAR o formulário
    // "/usuarios/cadastrar" = URL que recebe os dados do formulário
    @PostMapping("/usuarios/cadastrar")
    public String cadastrar (User user){
        // Chama o Service para salvar o usuário no banco
        userService.salvar(user);
        // Após salvar, redireciona para a lista de usuários
        // "redirect:" diz ao Spring para ir para outra URL
        return "redirect:/usuarios/novo";
        // Recebe os dados e salva
    }
    // Método interno que delega o salvamento para o Service
    // Controller não salva direto — passa para o Service
    public User salvar(User user){
        return userService.salvar(user);
    }
}
//      Para o melhor entendimento da lógica do código:
//1. Usuário acessa /usuarios/novo
//   → @GetMapping entra em ação
//   → return "usuarios/novo" mostra o formulário HTML
//
//2. Usuário preenche e clica em Cadastrar
//   → @PostMapping entra em ação
//   → userService.salvar(user) salva no banco
//   → return "redirect:/usuarios" manda para a lista
