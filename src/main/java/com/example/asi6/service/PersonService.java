package com.example.asi6.service;

import java.util.List;
import com.example.asi6.model.*;

public interface PersonService {
    
    List<Person> getallPerson();
    Person getPerson(long id);
    Person addPerson(Person p);
    
}
