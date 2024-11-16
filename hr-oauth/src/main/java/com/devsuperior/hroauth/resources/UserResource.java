package com.devsuperior.hroauth.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.devsuperior.hroauth.entitie.User;
import com.devsuperior.hroauth.services.UserService;

@Controller
@RequestMapping("/users")
public class UserResource {

	@Autowired
	private UserService userService;
	
	@GetMapping("/search")
	public ResponseEntity<User> findByEmail(@RequestParam String email) {
		ResponseEntity<User> retorno;
		try {
			retorno = ResponseEntity.ok(userService.findByEmail(email));
		} catch (Exception e) {
			retorno = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return retorno;
	}
}
