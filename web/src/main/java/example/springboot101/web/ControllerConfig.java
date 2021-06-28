package example.springboot101.web;

import example.springboot101.client.ComputerManagementClient;
import example.springboot101.client.ExampleClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ControllerConfig {

    @Value("${client.mode}")
    private String clientMode;

    @Autowired
    private ApplicationContext context;

    @Bean("ExampleClient")
    public ExampleClient exampleClient() {
        if ("remote".equals(clientMode)) {
            return (ExampleClient)context.getBean("ExampleRemoteClient");
        }
        return (ExampleClient)context.getBean("ExampleLocalClient");
    }

    @Bean("ComputerManagementClient")
    public ComputerManagementClient computerManagementClient() {
        if ("remote".equals(clientMode)) {
            return (ComputerManagementClient) context.getBean("RemoteComputerManagementClient");
        }
        return (ComputerManagementClient) context.getBean("LocalComputerManagementClient");
    }
}
