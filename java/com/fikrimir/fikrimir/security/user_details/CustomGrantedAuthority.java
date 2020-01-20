package com.fikrimir.fikrimir.security.user_details;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "authorities")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomGrantedAuthority implements GrantedAuthority {

    @Id
    @Column(name = "auth_id")
    private Long authId;
    @Column(name = "auth_code")
    private String authCode;


    @Override
    public String getAuthority() {
        return authCode;
    }
}
