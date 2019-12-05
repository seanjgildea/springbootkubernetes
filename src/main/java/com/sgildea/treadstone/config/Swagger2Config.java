package com.sgildea.treadstone.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.HashSet;

import static springfox.documentation.builders.RequestHandlerSelectors.withClassAnnotation;

/**
 * Created by sgildea on 12/4/19
 */

@Configuration
@EnableSwagger2
public class Swagger2Config {


    @Autowired
    private SwaggerProperties swaggerproperties;

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .protocols(new HashSet<>(Arrays.asList("https", "http")))
                .select()
                .apis(withClassAnnotation(RestController.class))
                .build()
                .apiInfo(metaData())
                .directModelSubstitute(LocalDate.class, String.class)
                .directModelSubstitute(LocalTime.class, String.class)
                .genericModelSubstitutes(ResponseEntity.class);
    }

    private ApiInfo metaData() {
        return new ApiInfoBuilder()
                .title(swaggerproperties.getTitle())
                .description(swaggerproperties.getDescription())
                .version(swaggerproperties.getVersion())
                .termsOfServiceUrl(swaggerproperties.getTermsOfServiceUrl())
                .contact(swaggerproperties.getContact())
                .license(swaggerproperties.getLicense())
                .licenseUrl(swaggerproperties.getLicenseUrl())
                .build();
    }

}