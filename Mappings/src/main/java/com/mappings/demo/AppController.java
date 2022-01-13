package com.mappings.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	PostRepository postRepository;
	
	@PostMapping("/users/add")
	public User addUser(@RequestBody User user) {
		return userRepository.save(user);
	}
	
	@PostMapping("/posts/add")
	public Post addPost(@RequestBody Post post) {
		return postRepository.save(post);
	}

}
