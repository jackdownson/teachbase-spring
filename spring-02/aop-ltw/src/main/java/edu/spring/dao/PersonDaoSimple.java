package edu.spring.dao;

import edu.spring.domain.Person;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDaoSimple implements PersonDao {
    public PersonDaoSimple() {
        System.out.println(this.getClass().getClassLoader());
    }

    public Person findByName(String name) {
        return new Person(name, 18);
    }
}
