package com.tka.ragistration.ragistration.service;

import com.tka.ragistration.ragistration.model.Registration;
import com.tka.ragistration.ragistration.repository.RegistrationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationImpl implements RegistrationService {

    @Autowired
RegistrationRepo repo;
    @Override
    public List<Registration> getAllPersons() {
        return repo.findAll();
    }

    @Override
    public Registration getPersonById(long id) {
     return repo.findById(id).orElse(null)  ;

    }

    @Override
    public Registration createPerson(Registration person) {
        return repo.save(person);
    }

    @Override
    public Registration updatePerson(long id, Registration person) {
        if (repo.existsById(id)) {
            person.setId(id);
            return repo.save(person);
        }
        return null;
    }

    @Override
    public void deletePerson(long id) {
        repo.deleteById(id);

    }
}
