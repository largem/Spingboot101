package example.springboot101.web;

import example.springboot101.model.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private JmsTemplate jmsTemplate;

    @PostMapping(value = "/message/")
    public void sendMessage(@RequestBody Computer computer) {
        jmsTemplate.convertAndSend("myqueue", computer);
    }

}
