package com.tka.ragistration.ragistration.service;

import com.tka.ragistration.ragistration.model.Registration;

import java.util.List;

public interface RegistrationService {
    List<Registration> getAllPersons();
    Registration getPersonById(long id);
    Registration createPerson(Registration person);
    Registration updatePerson(long id, Registration person);
    void deletePerson(long id);
}
