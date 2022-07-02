package com.yet.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author Ekko
 * @description Swagger3Config
 * @datetime 2022 07 03
 */
@Configuration
@EnableOpenApi
public class Swagger3Config {

  @Bean
  public Docket docket() {
    return new Docket(DocumentationType.OAS_30)
        .apiInfo(apiInfo())
        .enable(true)
        .select()
        // apis： 添加swagger接口提取范围
        .apis(RequestHandlerSelectors.basePackage("com.yet.controller"))
        // .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
        .paths(PathSelectors.any())
        .build();
  }

  private ApiInfo apiInfo() {
    return new ApiInfoBuilder()
        .title("forum测试接口文档")
        .description("forum测试接口文档 实现在线 API 文档")
        .contact(new Contact("Strive", "https://github.com/dspos", "1766078228@qq.com"))
        .version("3.0")
        .build();
  }
}
