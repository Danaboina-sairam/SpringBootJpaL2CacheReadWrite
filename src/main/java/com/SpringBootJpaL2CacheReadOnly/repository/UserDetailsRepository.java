package com.SpringBootJpaL2CacheReadOnly.repository;

import com.SpringBootJpaL2CacheReadOnly.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails,Long> {

}
