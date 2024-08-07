package br.com.sampaioarthur.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// public
// private
// protected

@RestController
@RequestMapping("/users")
public class UserController {

    // String
    // Integer
    // Double
    // Float
    // char
    // Date
    // void

    // body da requisicao
    @PostMapping("/")
    public void create(@RequestBody UserModel userModel) {
        System.out.println(userModel.getPassword());

    }
    
}
