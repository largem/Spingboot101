package example.springboot101.client;

import example.springboot101.model.Computer;

import java.util.List;

public interface ComputerManagementClient {
    List<Computer> getAllComputers();
}
