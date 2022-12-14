package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class SpringConfig {
    @Bean("logistics")
    public Logistics logistics(){
        return new Logistics();
    }
    @Bean("transportFactory")
    public TransportFactory transportFactory(){
        return new TransportFactory();
    }
}
