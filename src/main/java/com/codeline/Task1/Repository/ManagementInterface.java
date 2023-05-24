package com.codeline.Task1.Repository;

import com.codeline.Task1.Models.Management;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagementInterface extends JpaRepository<Management,Long> {
}
