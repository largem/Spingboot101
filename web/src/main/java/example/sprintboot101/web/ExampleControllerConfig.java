package example.sprintboot101.web;

import example.sprintboot101.client.ExampleClient;
import example.sprintboot101.client.ExampleLocalClient;
import example.sprintboot101.client.ExampleRemoteClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExampleControllerConfig {

    @Value("${exampleClient.mode}")
    private String exampleClientMode;

    @Bean("ExampleClient")
    public ExampleClient exampleClient() {
        if ("remote".equals(exampleClientMode)) {
            return new ExampleRemoteClient();
        }
        return new ExampleLocalClient();
    }
}
