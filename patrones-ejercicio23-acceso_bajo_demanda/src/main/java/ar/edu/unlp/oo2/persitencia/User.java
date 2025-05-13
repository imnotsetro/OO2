package ar.edu.unlp.oo2.persitencia;

import java.util.ArrayList;
import java.util.List;

/*
	1. Con la implementacion actual no es posible completar el requerimiento
	ya que existe una dependencia entre el usuario y el repositorio de posts.
 */

public class User implements PersistableUser {
	
	private String username;
	
	private String email;

	private PostRepositoryProxy posts;

	public User(String aUsername, String anEmail, PostRepositoryProxy aPosts) {
		this.username = aUsername;
		this.email = anEmail;
		this.posts = aPosts;
	}

	@Override
	public String getUsername() {
		return this.username;
	}

	@Override
	public String getEmail() {
		return this.email;
	}

	@Override
	public String toString() {
		return this.username + " - " + this.email;
	}

	@Override
	public List<Post> getPosts() {
		return this.posts.getPosts(this.username);
	}

	// Como se debe agregar nuevos post al usuario utilizando
	// el repositorio de posts?

//	public void addPost(Post post) {
//		this.posts.add(post);
//	}
//
//	public void addPosts(List<Post> posts) {
//		this.posts.addAll(posts);
//	}
}
