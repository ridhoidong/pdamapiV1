package com.example.pdamapi.controller;

import java.util.List;

import javax.validation.constraints.Null;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.pdamapi.model.User;
import com.example.pdamapi.repository.UserRepository;
import com.example.pdamapi.util.ResponDefault;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@RestController
@RequestMapping("/api/v1")
public class UserController {
	@Autowired
	UserRepository userRepository;
	
	Gson gson = new GsonBuilder().create();
	
	@RequestMapping(path = "/alluser", method = RequestMethod.GET)
	public ResponseEntity<?> getAllUser(){		
		return new ResponseEntity<>(ResponDefault.respon("00", "success", userRepository.getAllUser()), HttpStatus.OK);
	}
	
	@RequestMapping(path = "/auth", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<?> authUser(@RequestBody User user){
		try {		
			User datauserUser = userRepository.authLogin(user.getUsername(), user.getPassword());
			
			if (datauserUser != null) {
				return new ResponseEntity<>(ResponDefault.respon(200, "success", datauserUser), HttpStatus.OK);
			}
			else {
				return new ResponseEntity<>(ResponDefault.respon("90", "failed", datauserUser), HttpStatus.OK);
			}
		}
		catch(Exception e) {
			return new ResponseEntity<>(ResponDefault.respon("60", e.getMessage(), null), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}

}


