package example.springboot101.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


/**
 * configuration to enable Swagger2 in SpringBoot application
 * need {@code springfox-boot-starter} as dependency
 * url: http://localhost:8080/swagger-ui/
 */
@Configuration
public class SpringFoxConfig {

    /**
     * this is the first bean to define to make swagger2 to work
     */
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                //.apis(RequestHandlerSelectors.any())
                //replace with the follow to limit the controller in swagger
                .apis(RequestHandlerSelectors.basePackage("example.springboot101"))
                .paths(PathSelectors.any())
                .build();
    }
}
