package example.sprintboot101.client.local;

import example.sprintboot101.client.ExampleClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ExampleLocalClient")
public class ExampleLocalClient implements ExampleClient {

    @Autowired
    @Qualifier("ExampleService")
    private ExampleClient exampleClient;

    @Override
    public String greeting(String arg) {
        return exampleClient.greeting(arg);
    }
}
