package com.sgildea.treadstone.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import springfox.documentation.service.Contact;

/**
 * Created by sgildea on 12/4/19
 */
@Component
@ConfigurationProperties("swagger")
@Data
public class SwaggerProperties {

    private String title;
    private String description;
    private String version;
    private String termsOfServiceUrl;
    private Contact contact;
    private String license;
    private String licenseUrl;

}
