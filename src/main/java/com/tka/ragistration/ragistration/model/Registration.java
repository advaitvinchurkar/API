package com.tka.ragistration.ragistration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Registration")
public class Registration {
    @Id
    long id;
    String firstname;
    String lastname;
    String address;
    long mobnumber;

    @Override
    public String toString() {
        return "Registration{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", mobnumber=" + mobnumber +
                '}';
    }

    public Registration() {
    }

    public Registration(long id, String firstname, String lastname, String address, long mobnumber) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.mobnumber = mobnumber;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMobnumber(long mobnumber) {
        this.mobnumber = mobnumber;
    }

    public long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public long getMobnumber() {
        return mobnumber;
    }

}
