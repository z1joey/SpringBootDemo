package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * @author yizhang
 */
public interface PersonDao {

    /**
     * Insert a Person object with UUID
     *
     * @param id unique id
     * @param person Person object
     * @return int
     */
    int insertPerson(UUID id, Person person);

    /**
     * Add a Person object with UUID
     *
     * @param person Person object
     * @return int
     */
    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    /**
     * Fet all people
     * @return List of Person object
     */
    List<Person> selectAllPeople();

    /**
     * Delete a person object by UUID
     * @param id UUID
     * @return int
     */
    int deletePersonById(UUID id);

    /**
     * Update a person object by id and object
     * @param id UUID
     * @param person Person object
     * @return int
     */
    int updatePersonById(UUID id, Person person);

    /**
     * Fetch an optional Person object
     * @param id UUID
     * @return Optional object
     */
    Optional<Person> selectPersonById(UUID id);
}
