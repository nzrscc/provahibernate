package com.example.hibernate.provahibernate.controller;

import com.example.hibernate.provahibernate.models.UserModel;
import com.example.hibernate.provahibernate.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {
  
  @Autowired
  private UserService userService;
  
  public HomeController() {}
  
  @RequestMapping("/")
  public String home(HttpSession session) {
    return "home";
  }
  
  @PostMapping("/registrati")
  public ModelAndView registrati() {
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("registrati");
    return modelAndView;
  }
  
  @PostMapping("/registrazione")
  public ModelAndView registrazione(@ModelAttribute("currentUser")UserModel user) {
    ModelAndView modelAndView = new ModelAndView();
    userService.save(user.getUsername(), user.getNome());
    modelAndView.setViewName("home");
    return modelAndView;
  }
  
  @Scope("session")
  @PostMapping("/logIn")
  public ModelAndView logIn(@ModelAttribute("currentUser") UserModel user, HttpSession session) {
    ModelAndView modelAndView = new ModelAndView();
    if(userService.existsByUsername(user.getUsername())) {
      UserModel userModel = new UserModel();
      System.out.println("username = " + user.getUsername() + "; nome = " + user.getNome());
      int idCurrentUser = userService.getIdByUsername(user.getUsername());
      session.setAttribute("idCurrentUser", idCurrentUser);
      session.setAttribute("username", user.getUsername());
      session.setAttribute("nome", user.getNome());
      modelAndView.setViewName("accesso");
    } else {
      modelAndView.setViewName("home");
    }
    return modelAndView;
  }
}
