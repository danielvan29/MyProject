package com.van.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket docket1(Environment environment) {

        Profiles profiles = Profiles.of("dev");
        //判断当前所处的环境
        environment.acceptsProfiles(profiles);

        return new Docket(DocumentationType.OAS_30)
                .apiInfo(createApiInfo())
                .groupName("van")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.van.controller"))
                .build();
    }

    @Bean
    public Docket docket2(Environment environment) {

        Profiles profiles = Profiles.of("dev");
        //判断当前所处的环境
        environment.acceptsProfiles(profiles);

        return new Docket(DocumentationType.OAS_30).apiInfo(createApiInfo()).groupName("tom");
    }

    public ApiInfo createApiInfo() {
        return new ApiInfoBuilder().title("金鱼佬").description("试一哈").version("1.0.0").build();
    }
}
