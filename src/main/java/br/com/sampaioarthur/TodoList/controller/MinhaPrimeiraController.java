package br.com.sampaioarthur.TodoList.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
public class MinhaPrimeiraController {
    
    // Metodos de acesso HTTP
    // GET - buscar informacao
    // POST - adicionar um dado/informacao
    // PUT - alterar um dado/informacao
    // DELETE - remover um dado
    // PATCH - alterar somente uma parte da info/dado


    @GetMapping("/primeiroMetodo")
    public String primeiraMensagem(){
        return "Funcionou";
    }
    
}

