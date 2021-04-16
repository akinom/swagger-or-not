package com.shoprunner.demo.webapp.swaggered

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

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
