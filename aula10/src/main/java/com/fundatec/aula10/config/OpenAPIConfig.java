package com.fundatec.aula10.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI springShopAPI() {
        return new OpenAPI()
                .info(new Info().title("Aula 10")
                        .description("Exemplos de APIs para manipulação de dados em BD")
                        .version("v0.0.1")
                        .license(new License().name("Apache 2.0").url("http://fundatec.com.br")))
                .externalDocs(new ExternalDocumentation()
                        .description("Wiki")
                        .url("https://wiki.org/docs"));
    }
}
