package com.emma.bootscala.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * Create Meta Database in mysql
 */
@Entity
@Table
public class MetaDatabase {

    @Id
    @GeneratedValue
    /** Database ID **/
    private Integer id;

    /** Database name **/
    private String name;

    /** Database file location **/
    private String location;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
