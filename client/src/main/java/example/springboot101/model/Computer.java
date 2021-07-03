package example.springboot101.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Computer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(accessMode = ApiModelProperty.AccessMode.READ_ONLY, dataType = "java.lang.Long")
    private long id;
    private String name;

    /**
     * need a default constructor, it seems query is using it to populate the result.
     */
    public Computer() {
    }

    public Computer(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
