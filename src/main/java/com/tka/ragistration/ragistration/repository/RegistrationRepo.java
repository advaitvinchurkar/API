package com.tka.ragistration.ragistration.repository;

import com.tka.ragistration.ragistration.model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepo  extends JpaRepository<Registration ,Long> {
}
