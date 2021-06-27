package example.springboot101.web;

import example.springboot101.client.ExampleClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @Autowired
    @Qualifier("ExampleClient")
    private ExampleClient exampleClient;

    @GetMapping("/greeting/{arg}")
    public String hello(@PathVariable String arg) {
        return exampleClient.greeting("Hello World " + arg);
    }
}
