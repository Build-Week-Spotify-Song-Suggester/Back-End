package com.lambdaschool.spotifysongsuggester.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Pageable;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

// http://localhost:2019/swagger-ui.html
@Configuration
@EnableSwagger2
public class Swagger2Config
{
    @Bean
    public Docket api()
    {
        return new Docket(DocumentationType.SWAGGER_2).select()
                                                      //                .apis(RequestHandlerSelectors.any())
                                                      .apis(RequestHandlerSelectors.basePackage("com.lambdaschool.spotifysongsuggester"))
                                                      .paths(PathSelectors.any())
                                                      .build()
                                                      .useDefaultResponseMessages(false) // Allows only my exception responses
                                                      .ignoredParameterTypes(Pageable.class) // allows only my paging parameter list
                                                      .apiInfo(apiEndPointsInfo());
    }

    private ApiInfo apiEndPointsInfo()
    {
        return new ApiInfoBuilder().title("Spotify Song Suggester")
                                   .description("A dashboard app to enable users to browse and visualize audio features " +
                                                        "of over 116k Spotify songs. Application developed by FE, BE, and DS " +
                                                        "students at @LambdaSchool during Build Week")
                                   .description("Project GiHub: https://github.com/Build-Week-Spotify-Song-Suggester")
                                   .contact(new Contact("Vicky Yue", "http://www.lambdaschool.com", "vyue013@gmail.com"))
                                   .license("MIT")
                                   .version("1.0.0")
                                   .build();
    }
}
