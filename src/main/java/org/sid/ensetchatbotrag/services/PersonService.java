package org.sid.ensetchatbotrag.services;

import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;
import com.vaadin.hilla.crud.CrudRepositoryService;
import org.sid.ensetchatbotrag.PersonRepository;
import org.sid.ensetchatbotrag.entities.Person;

@BrowserCallable
@AnonymousAllowed
public class PersonService extends CrudRepositoryService<Person, Long, PersonRepository> {
}
