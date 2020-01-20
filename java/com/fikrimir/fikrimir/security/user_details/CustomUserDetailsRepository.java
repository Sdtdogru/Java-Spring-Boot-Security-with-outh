package com.fikrimir.fikrimir.security.user_details;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomUserDetailsRepository extends JpaRepository<CustomUserDetails,Long> {
    public CustomUserDetails findByUsername(String username);
}
