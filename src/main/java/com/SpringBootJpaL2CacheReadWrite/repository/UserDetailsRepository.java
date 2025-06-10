package com.SpringBootJpaL2CacheReadWrite.repository;

import com.SpringBootJpaL2CacheReadWrite.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails,Long> {

}
