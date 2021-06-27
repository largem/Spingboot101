package example.springboot101.web;

import example.springboot101.client.ExampleClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExampleControllerConfig {

    @Value("${exampleClient.mode}")
    private String exampleClientMode;

    @Autowired
    private ApplicationContext context;

    @Bean("ExampleClient")
    public ExampleClient exampleClient() {
        if ("remote".equals(exampleClientMode)) {
            return (ExampleClient)context.getBean("ExampleRemoteClient");
        }
        return (ExampleClient)context.getBean("ExampleLocalClient");
    }
}
