package io.unbounded.sma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {


  @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
  public String dashboard() {
    return "dashboard";
  }
}