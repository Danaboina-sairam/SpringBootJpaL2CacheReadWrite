package com.SpringBootJpaL2CacheReadWrite.service;

import com.SpringBootJpaL2CacheReadWrite.entity.UserDetails;
import com.SpringBootJpaL2CacheReadWrite.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetailService {
    @Autowired
    UserDetailsRepository userDetailsRepository;

    public UserDetails saveUser(UserDetails userDetails){
        return userDetailsRepository.save(userDetails);
    }

    public UserDetails updateUser(Long id,UserDetails userDetails){
        UserDetails existingUser=userDetailsRepository.findById(id).get();
        existingUser.setName(userDetails.getName());
        existingUser.setEmail(userDetails.getEmail());
        return userDetailsRepository.save(existingUser);
    }

    public UserDetails findById(Long primaryKey){
        return userDetailsRepository.findById(primaryKey).get();
    }
}
