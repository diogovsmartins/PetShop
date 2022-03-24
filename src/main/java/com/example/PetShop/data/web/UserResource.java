package com.example.PetShop.data.web;

import com.example.PetShop.data.base.UserRepository;
import com.example.PetShop.interfaceAdapters.UserUseCase;
import com.example.PetShop.models.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserResource {

    @Autowired
    UserUseCase userUseCase;

    @Autowired
    UserRepository userRepository;

    @CrossOrigin(origins = "http://127.0.0.1:5500/")
    @PostMapping(value = "/cadastro/{nome}/{telefone}/{endereco}/{cpf}")
    public void cadastrarUsuario(@PathVariable String nome, @PathVariable String telefone, @PathVariable String endereco,@PathVariable String cpf){
        userUseCase.cadastrarUsuario(nome, telefone, endereco, cpf);
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500/")
    @GetMapping(value = "/list")
    @ResponseBody
    public List<UserEntity> listUsers(){
        return userRepository.findAll();
    }
}
