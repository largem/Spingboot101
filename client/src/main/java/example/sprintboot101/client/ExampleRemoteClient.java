package example.sprintboot101.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ExampleRemoteClient implements ExampleClient {

    @Autowired
    @Qualifier("ExampleService")
    private ExampleClient exampleClient;

    @Override
    public String greeting(String arg) {
        return exampleClient.greeting("From RemoteClient: " + arg);
    }
}
