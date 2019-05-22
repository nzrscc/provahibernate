package com.example.hibernate.provahibernate.services;

import com.example.hibernate.provahibernate.models.UserModel;
import com.example.hibernate.provahibernate.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
  
  private UserRepository theUserRepository;
  
  @Autowired
  public UserServiceImpl(UserRepository theUserRepository) {
    this.theUserRepository = theUserRepository;
  }
  
  @Override
  public void save(String username, String nome) {
    UserModel userModel = new UserModel(username, nome);
    theUserRepository.save(userModel);
    
  }
  
  @Override
  public int getIdByUsername(String username) {
    UserModel userModel = theUserRepository.getUserModelByUsername(username);
    return userModel.getId();
  }
  
  @Override
  public boolean existsByUsername(String username) {
    return theUserRepository.existsByUsername(username);
  }
  
  @Override
  public String getUsernameById(int id) {
    UserModel userModel = theUserRepository.getUserModelById(id);
    return userModel.getUsername();
  }
}
