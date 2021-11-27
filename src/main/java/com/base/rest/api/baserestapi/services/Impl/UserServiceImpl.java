package com.base.rest.api.baserestapi.services.Impl;

import java.util.Optional;
import com.base.rest.api.baserestapi.domain.User;
import com.base.rest.api.baserestapi.repositories.UserRepository;
import com.base.rest.api.baserestapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

  @Autowired
  private UserRepository repository;

  @Override
  public User findById(Integer id) {

    Optional<User> obj = repository.findById(id);
    return obj.orElse(null);
  }
}
