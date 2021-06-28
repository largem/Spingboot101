package example.springboot101.client.impl;

import example.springboot101.client.ExampleClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ExampleLocalClient")
public class ExampleLocalClient implements ExampleClient {

    final private ExampleClient exampleClient;

    @Autowired
    public ExampleLocalClient(@Qualifier("ExampleService")ExampleClient exampleClient) {
        this.exampleClient = exampleClient;
    }

    @Override
    public String greeting(String arg) {
        return exampleClient.greeting("From LocalClient: " + arg);
    }
}
