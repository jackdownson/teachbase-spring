package edu.spring.config;

import edu.spring.service.PersonService;
import edu.spring.service.PersonServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import edu.spring.dao.PersonDao;

@Configuration
public class ServicesConfig {

    @Bean
    public PersonService personService(PersonDao dao) {
        return new PersonServiceImpl(dao);
    }
}
