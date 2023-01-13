//package com.codersue.bianbei_server.config;
//
//import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//
//import java.util.ArrayList;
//
//@Configuration
//@EnableKnife4j
//public class Knife4jConfig {
//
//    @Bean
//    public Docket docket(){
//        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
//                .enable(true)
//                .groupName("system")
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.codersue.bianbei_server.controller"))
//                .paths(PathSelectors.any())
//                .build();
//    }
//
//    private ApiInfo apiInfo(){
//
//        return new ApiInfo("编贝服务接口文档",
//                "",
//                "1.0",
//                "",
//                new Contact("name","url","email"),
//                "",
//                "",
//                new ArrayList<>());
//    }
//}
