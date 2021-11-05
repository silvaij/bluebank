package br.com.bloodblue.bluebank.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.security.cert.CertPathBuilder;
import java.util.Arrays;
import java.util.HashSet;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket detalheApi(){
        Docket docket = new Docket(DocumentationType.SWAGGER_2);

        docket
                .select()
                .apis(RequestHandlerSelectors.basePackage("br.com.bloodblue.bluebank.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(this.infomacoesApi().build())
                .consumes(new HashSet<String>(Arrays.asList("application/json")))
                .produces(new HashSet<String>(Arrays.asList("application/json")));

        return docket;
    }

    private ApiInfoBuilder infomacoesApi() {
        ApiInfoBuilder informacoesApi = new ApiInfoBuilder();

        informacoesApi.title("GAMA-IBM-BLUEBANK");
        informacoesApi.description("API que persiste clientes em banco e simula transções bancárias");
        informacoesApi.version("1.0");
        informacoesApi.termsOfServiceUrl("Termo de uso: IBM Corporation");
        informacoesApi.license("BloodBlue - Open Source initiative");
        informacoesApi.contact("EQUIPE: BLOODBLUE - 06");

        return informacoesApi;

    }
}
