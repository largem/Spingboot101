package example.springboot101.service;

import com.google.common.collect.Lists;
import example.springboot101.client.ComputerManagementClient;
import example.springboot101.model.Computer;
import example.springboot101.repository.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ComputerManagementService")
public class ComputerManagementService implements ComputerManagementClient {

    @Autowired
    private ComputerRepository computerRepository;

    @Override
    public List<Computer> getAllComputers() {
        return Lists.newArrayList(computerRepository.findAll());
    }
}
