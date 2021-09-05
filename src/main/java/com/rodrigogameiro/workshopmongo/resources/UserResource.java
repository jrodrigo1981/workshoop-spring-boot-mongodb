package com.rodrigogameiro.workshopmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigogameiro.workshopmongo.domain.User;
import com.rodrigogameiro.workshopmongo.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService service;

	/* @GetMapping */
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {

		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
