package com.rodrigogameiro.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigogameiro.workshopmongo.domain.Post;
import com.rodrigogameiro.workshopmongo.repository.PostRepository;
import com.rodrigogameiro.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> post = repo.findById(id);
		return post.orElseThrow(() -> new ObjectNotFoundException("Post not found"));
	}

}
