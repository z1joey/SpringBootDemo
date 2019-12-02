package com.example.demo.dao;

import com.example.demo.model.Person;
import java.util.UUID;

/**
 * @author yizhang
 */
public interface PersonDao {

    /**
     * insert a Person object with UUID
     *
     * @param id unique id
     * @param person Person object
     * @return int
     */
    int insertPerson(UUID id, Person person);

    /**
     * add a Person object with UUID
     *
     * @param person Person object
     * @return int
     */
    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

}
