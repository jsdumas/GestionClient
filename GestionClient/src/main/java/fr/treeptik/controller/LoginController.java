package fr.treeptik.controller;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Scope("request")
@Controller
@RequestMapping("/login")
public class LoginController implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	

}
