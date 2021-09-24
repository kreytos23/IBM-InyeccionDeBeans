package org.example;

import beans.Saludo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Saludo saludo(){
        return new Saludo();
    }
}
