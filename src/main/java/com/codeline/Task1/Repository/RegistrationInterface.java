package com.codeline.Task1.Repository;

import com.codeline.Task1.Models.Game;
import com.codeline.Task1.Models.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationInterface extends JpaRepository<Registration,Long> {
}
