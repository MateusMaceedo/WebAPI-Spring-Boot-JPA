package com.base.rest.api.baserestapi.repositories;

import com.base.rest.api.baserestapi.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
  Optional<User> findByEmail(String email);
}
