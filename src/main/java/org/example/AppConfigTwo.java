package org.example;

import beans.Saludo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigTwo {
    @Bean
    public Saludo despedida(){
        return new Saludo();
    }
}
