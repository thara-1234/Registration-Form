package com.example.RegistrationForm.PhoneNumber;



import com.example.RegistrationForm.Service.ApplicantService;
import org.springframework.data.domain.Example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public  class Checkingdigits extends ApplicantService {

    public static String isValid(String phone_no){

        Pattern p = Pattern.compile("^\\d{10}$");
        Matcher m = p.matcher(phone_no );
       boolean b= m.matches();
        if(b==false){
            return "Invalid Number";
        }
        else return phone_no;


    }



}
