package example.springboot101.repository;

import example.springboot101.model.Computer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComputerRepository extends CrudRepository<Computer, Long> {

    @Override
    List<Computer> findAll();
}
