package com.example.user.client.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.user.client.model.UserE;



@RestController
@RequestMapping("/user/client")
public class ClientController {

	@Autowired
	private RestTemplate restTemplate;




	@GetMapping
	public String  getUrl() {
		System.out.println("Inside Client");
		String url="http://user-DB-Server/user/db/api/users";
	   String result= restTemplate.getForObject(url, String.class)+ " including client";
	   System.out.println("hhhhhhhh"+result);
		 return result;
	}



}
