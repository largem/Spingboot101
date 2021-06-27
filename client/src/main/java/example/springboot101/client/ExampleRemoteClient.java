package example.springboot101.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ExampleRemoteClient")
public class ExampleRemoteClient implements ExampleClient {

    final private ExampleClient exampleClient;

    @Autowired
    public ExampleRemoteClient(@Qualifier("ExampleService") ExampleClient exampleClient) {
        this.exampleClient = exampleClient;
    }

    @Override
    public String greeting(String arg) {
        return exampleClient.greeting("From RemoteClient: " + arg);
    }
}
