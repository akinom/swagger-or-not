package com.shoprunner.demo.webapp.swaggered

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
class Swagger {
    @Bean
    fun api(): Docket {
        return Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.basePackage("net.mestwin.mongodbrestapidemo.controller"))
            .paths(PathSelectors.any())
            .build()
    }
}
