package com.example.RegistrationForm.Controller;

import com.example.RegistrationForm.Entity.Applicant;
import com.example.RegistrationForm.Service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class ApplicantController {
    @Autowired
    ApplicantService applicantService;
    @RequestMapping(value = "/applicants",method = RequestMethod.POST)
public void createApplicant(@RequestBody Applicant applicant){
    applicantService.createAnApplicant(applicant);
}

}
