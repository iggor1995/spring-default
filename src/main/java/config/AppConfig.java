package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.UserService;

@Configuration
public class AppConfig {

    @Bean
    public UserService userService() {
        return new UserService();
    }
}
