package com.base.rest.api.baserestapi.config;

import com.base.rest.api.baserestapi.domain.User;
import com.base.rest.api.baserestapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

  @Autowired
  private UserRepository repository;

  @Bean
  public void startDB() {
      User u1 = new User(null, "Mateus", "mateus@mail.com", "123");
      User u2 = new User(null, "Macedo", "macedo@mail.com", "123");

      repository.saveAll(List.of(u1, u2));
  }
}
