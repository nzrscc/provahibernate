package com.example.hibernate.provahibernate.repository;

import com.example.hibernate.provahibernate.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer> {
  
  UserModel getUserModelByUsername(String username);
  
  
  
  UserModel getUserModelById(int id);
  
  boolean existsByUsername(String username);
  
}
