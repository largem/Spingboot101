package example.springboot101.client.impl;

import example.springboot101.client.ComputerManagementClient;
import example.springboot101.model.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("LocalComputerManagementClient")
public class LocalComputerManagementClient implements ComputerManagementClient {

    private final ComputerManagementClient client;

    @Autowired
    public LocalComputerManagementClient(@Qualifier("ComputerManagementService") ComputerManagementClient client) {
        this.client = client;
    }

    @Override
    public List<Computer> getAllComputers() {
        return client.getAllComputers();
    }
}
