package com.example.PetShop.interfaceAdapters;

import com.example.PetShop.data.base.UserRepository;
import com.example.PetShop.models.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserUseCase {

    @Autowired
    UserRepository userRepository;
    /*Cadastrar Usuário:
			Sendo: Um funcionário
			Posso: Cadastrar um usuário
			Para que:	Possa cadastrar usuário
			Criterios de aceite:
			Usuário precisa informar:
			Nome completo, telefone, endereço e cpf.
			Mostrar um formulário com os dados que precisam ser
			preenchidos, ao clicar no botão "salvar" salvar no
			banco de dados e mostra a mensagem
			"salvo no banco de dados".
	*/

    public ResponseEntity<HttpStatus> cadastrarUsuario(String nome, String telefone, String endereco, String cpf) {
        UserEntity user = new UserEntity(null, nome, telefone, endereco, cpf);
        if (
            user.getCpf().equals("") ||
            user.getNomeCompleto().equals("") ||
            user.getEndereco().equals("") ||
            user.getTelefone().equals("")
        ) {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
        userRepository.saveAndFlush(user);
        return  new ResponseEntity<>(HttpStatus.CREATED);
    }


}
