package com.myapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//https://www.youtube.com/watch?v=PDIVqWyGJ2k
/*
stop
run as maven clean
run as maven build
project click derecho
	propiedades
		resource
			Location
				busca el path
*/
@RestController
@RequestMapping("/home")//endpoint
public class HomeController {
	
	@GetMapping("/saludo")//endpoint http://localhost:8080/home/saludo
	public String saludo() {//
		return "hola mundo desde myapp";
	}	
}
