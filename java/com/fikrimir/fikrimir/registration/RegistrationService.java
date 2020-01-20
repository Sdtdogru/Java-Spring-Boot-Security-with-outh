package com.fikrimir.fikrimir.registration;

import com.fikrimir.fikrimir.security.user_details.CustomUserDetails;
import com.fikrimir.fikrimir.security.user_details.CustomUserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired
    private CustomUserDetailsRepository customUserDetailsRepository;


    public CustomUserDetails saveUser(CustomUserDetails customUserDetails){

        return customUserDetailsRepository.save(customUserDetails);

    }
}
