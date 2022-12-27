package com.example.RegistrationForm.Repository;

import com.example.RegistrationForm.Entity.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicantRepository extends JpaRepository<Applicant,Integer> {


}
