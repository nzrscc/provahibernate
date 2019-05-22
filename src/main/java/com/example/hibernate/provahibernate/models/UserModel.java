package com.example.hibernate.provahibernate.models;

import javax.persistence.*;

@Entity
@Table(name = "prova")
public class UserModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private int id;
  
  @Column(name = "username")
  private String username;
  
  @Column(name = "nome")
  private String nome;
  
  public UserModel() {
  }
  
  public UserModel(String username, String nome) {
    this.username = username;
    this.nome = nome;
  }
  
  public int getId() {
    return id;
  }
  
  public void setId(int id) {
    this.id = id;
  }
  
  public String getUsername() {
    return username;
  }
  
  public void setUsername(String username) {
    this.username = username;
  }
  
  public String getNome() {
    return nome;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  
  @Override
  public String toString() {
    return "UserModel{" +
            "id=" + id +
            ", username='" + username + '\'' +
            ", nome='" + nome + '\'' +
            '}';
  }
}
