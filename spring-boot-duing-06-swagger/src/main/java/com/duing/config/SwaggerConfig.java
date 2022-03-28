package com.duing.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


//声明是配置文件
@Configuration
//开启Swagger功能
@EnableSwagger2
public class SwaggerConfig implements WebMvcConfigurer {

    /**
     * 使用swagger需要创建一个摘要  Docket
     * 摘要参数如下：
     * 文档类型 - 使用swagger2 -  DocumentationType.SWAGGER_2
     * 文档通过一系列的选择器组成   api  path
     * select()设置apis()和paths()
     * apis 查找生成哪些controller的接口
     *        获取所有RequestHandlerSelectors.any()
     * path 在查找出来的接口中进行筛选
     * @return
     */
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.duing.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    /**
     * 自定义文档的介绍
     * 通过ApiInfoBuilder创建ApiInfo
     * 参数可以设置  title description version 标题  描述  版本等等
     * @return
     */
    public ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("spring-boot-duing-06-swagger")
                .description("这是一个简单的swagger（文档） demo 。。。")
                .version("1.0")
                .build();
    }

}
