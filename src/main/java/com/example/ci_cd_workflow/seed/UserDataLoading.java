package com.example.ci_cd_workflow.seed;

import com.example.ci_cd_workflow.model.User;
import com.example.ci_cd_workflow.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserDataLoading implements CommandLineRunner {

    private final UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        if(userRepository.existsByUsername("Vannchhai")){
            return;
        }

        User user = User
                .builder()
                .username("Vannchhai")
                .email("vannchhai@gmail.com")
                .password("vannchhai123")
                .build();
        userRepository.save(user);
    }
}
