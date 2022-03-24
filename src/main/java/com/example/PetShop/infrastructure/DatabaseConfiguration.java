package com.example.PetShop.infrastructure;

import com.example.PetShop.data.base.UserRepository;
import com.example.PetShop.models.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;
import java.util.List;

@Configuration
@Profile("test")
public class DatabaseConfiguration implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) {
        userRepository.saveAll(getUsers());
    }

    List<UserEntity> getUsers() {
        UserEntity user1 = new UserEntity(null, "bruno", "rua1", "1234-56789", "123.456.789-12");
        UserEntity user2 = new UserEntity(null, "breno", "rua2", "9876-54321", "321.642.867-88");
        UserEntity user3 = new UserEntity(null, "brino", "rua3 ", "9876-54321", "832.567.123-23");
        UserEntity user4 = new UserEntity(null, "brono", "rua4", "3333-33333", "888.334.212-55");
        UserEntity user5 = new UserEntity(null, "brano", "rua5", "2225-53321", "992.125.311-87");
        UserEntity user6 = new UserEntity(null, "brona", "rua6", "5521-7543", "199.133.559-92");
        UserEntity user7 = new UserEntity(null, "briana", "rua7", "1721-7213", "196.133.544-12");
        UserEntity user8 = new UserEntity(null, "brubrana", "rua8", "5428-7942", "921.537.359-22");

        return Arrays.asList(user1, user2, user3, user4, user5, user6, user7, user8);
    }

}
