package com.wedevol.emptyspringrest.controller;


import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.wedevol.emptyspringrest.entity.User;

/**
 * User REST Controller
 * 
 * @author charz
 *
 */
@RestController
@RequestMapping("/users")
public class UserController {

	protected static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	private static final User user1 = new User(1L, "Carlos", Arrays.asList("charz"), 26, "charz@yopmail.com");

	@RequestMapping(value = "/{userId}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public User findById(@PathVariable Long userId) throws Exception {
		logger.info("Find user by id: {}", userId);
		if (userId.equals(1L)){
			return user1;
		} else {
			throw new Exception("I just created 1 user to test!");
		}
	}

}
