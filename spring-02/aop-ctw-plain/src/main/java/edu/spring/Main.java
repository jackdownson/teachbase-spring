package edu.spring;

import edu.spring.dao.PersonDao;
import edu.spring.dao.PersonDaoSimple;
import edu.spring.domain.Person;
import edu.spring.service.PersonService;
import edu.spring.service.PersonServiceImpl;

/*
Запуск примера:
    1. cd aop-demo/aop-ctw-plain/
    2. mvn clean package
    3. cd target
    4. java -jar aop-ctw-plain-1.0-jar-with-dependencies.jar
 */

public class Main {

    public static void main(String[] args) {
        PersonDao personDao = new PersonDaoSimple();
        PersonService service = new PersonServiceImpl(personDao);

        Person ivan = service.getByName("Ivan");
        System.out.println("name: " + ivan.getName() + " age: " + ivan.getAge());
    }
}
