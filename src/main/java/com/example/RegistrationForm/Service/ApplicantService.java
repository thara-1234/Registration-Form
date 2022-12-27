package com.example.RegistrationForm.Service;

import com.example.RegistrationForm.Entity.Applicant;
import com.example.RegistrationForm.Repository.ApplicantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
public class ApplicantService {

    @Autowired
    ApplicantRepository applicantRepository;

    public void createAnApplicant(Applicant applicant){
        applicantRepository.save(applicant);
    }



    }















