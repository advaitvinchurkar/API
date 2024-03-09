package com.tka.ragistration.ragistration.controller;

import com.tka.ragistration.ragistration.model.Registration;
import com.tka.ragistration.ragistration.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@RestController
@RequestMapping("/api/registration")
public class RegistrationController {
    @Autowired
    RegistrationService rs;

    @GetMapping("/get")
    public ResponseEntity< List<Registration> > getAllPerson(Registration res){
      List<Registration> registration=  rs.getAllPersons();
      if (registration != null)
        return new ResponseEntity<>(registration,HttpStatus.CREATED );
      else
          return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED );

    }

    @PostMapping("/create")
    public  ResponseEntity<Registration> createPerson(@RequestBody Registration res)
    {
        Registration r1=rs.createPerson(res);
        return new ResponseEntity<>(r1,HttpStatus.CREATED);


    }

    @PutMapping("/update")
    public ResponseEntity<Registration> updatePerson(@RequestBody long id,@RequestBody Registration res )
    {
        Registration r2=rs.updatePerson(id,res);
        if(r2 !=null) {

            return new ResponseEntity<>(r2, HttpStatus.OK);
        }
        else {

            return new ResponseEntity<>(r2, HttpStatus.NO_CONTENT);

        }
    }
    @DeleteMapping("/delete")
    public  ResponseEntity<Registration> deletePerson(@RequestBody long id)
    {
        rs.deletePerson(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
