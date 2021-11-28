package com.base.rest.api.baserestapi.services;

import java.util.List;
import com.base.rest.api.baserestapi.domain.User;
import com.base.rest.api.baserestapi.domain.dto.UserDTO;

public interface UserService {

  User findById(Integer id);
  List<User> findAll();
  User create(UserDTO obj);
  User update(UserDTO obj);
  void delete(Integer id);
}
