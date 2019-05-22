package com.example.hibernate.provahibernate.services;

public interface UserService {

  void save(String username, String nome);
  
  int getIdByUsername(String username);
  
  boolean existsByUsername(String username);
  
  String getUsernameById(int id);
}
