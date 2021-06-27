package example.springboot101.service;

import example.springboot101.client.ExampleClient;
import org.springframework.stereotype.Service;

@Service("ExampleService")
public class ExampleService implements ExampleClient {

    @Override
    public String greeting(String arg) {
        return arg;
    }
}
