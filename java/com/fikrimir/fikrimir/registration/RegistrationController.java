package com.fikrimir.fikrimir.registration;

import com.fikrimir.fikrimir.security.user_details.CustomUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {


    @Autowired
    private RegistrationService registrationService;

    @PostMapping("/registration")
    public CustomUserDetails customUserDetails(@RequestBody CustomUserDetails customUserDetails){
        final BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        final String encoderPassword = bCryptPasswordEncoder.encode(customUserDetails.getPassword());
        customUserDetails.setPassword(encoderPassword);
        return registrationService.saveUser(customUserDetails);

    }
}
