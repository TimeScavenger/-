package com.dedecms.health.config;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
//    @Bean
//    public Docket createRestApi() {
//        String basePck = WebApplicaiton.class.getPackage().getName();
//        System.out.println(basePck + "=启动类所在的包为路径扫描=====定义生成接口文档的包路径=====");
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .select()
//                .apis(RequestHandlerSelectors.basePackage(basePck))
//                .paths(PathSelectors.any())
//                .build();
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title("传智播客_传智健康_接口文档")
//                .description("描述内容")
//                .version("2.1.1")
//                .build();
//    }

}