package example.sprintboot101.web;

import example.sprintboot101.client.ExampleClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @Autowired
    @Qualifier("ExampleClient")
    private ExampleClient exampleClient;

    @RequestMapping("/greeting")
    public String hello() {
        return exampleClient.greeting("Hello World");
    }
}
