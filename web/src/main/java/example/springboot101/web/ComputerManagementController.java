package example.springboot101.web;

import example.springboot101.client.ComputerManagementClient;
import example.springboot101.model.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ComputerManagementController {

    @Autowired
    private ComputerManagementClient computerManagementClient;

    @GetMapping("/computermanagement/compupters")
    public List<Computer> getAllComputers() {
        return computerManagementClient.getAllComputers();
    }
}
