package com.alt;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.alt.entity.ProfileEntity;
import com.alt.entity.UserEntity;
import com.alt.repository.ProfileRepository;
import com.alt.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner loadDbRecords(UserRepository repo, ProfileRepository proRepo) {
        return args->{
        ProfileEntity uProfile = new ProfileEntity();
        UserEntity user1 = new UserEntity();

            uProfile.setBio("fullStack");
            uProfile.setPhone("9834502943L");
            user1.setName("John");
            user1.setProfile(uProfile);

            UserEntity save = repo.save(user1);
            System.out.println(save);
        };
    }

}
