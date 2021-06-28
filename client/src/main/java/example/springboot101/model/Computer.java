package example.springboot101.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Computer {

    @Id
    private long id;
    private String name;

    public Computer(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
