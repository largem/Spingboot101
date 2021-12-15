package example.springboot101.message;

import example.springboot101.model.Computer;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ExampleMessageReceiver {

    @JmsListener(destination = "myqueue", containerFactory = "messageFactory")
    public void receiveMessage(Computer computer) {
        System.out.println("Message received: " + computer.getName());
    }
}
