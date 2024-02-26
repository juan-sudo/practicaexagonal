package com.codigo.mspracticando.application.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI custonOpenAPI(){
        return new OpenAPI()
                .info(new Info().title("apis del MS REGISTRO").version("2.0"));
    }
}