package ar.edu.unlp.oo2.persitencia;

import java.util.List;

public class PostRepositoryProxy {
    private PostRepository postRepository;

    public PostRepositoryProxy() {
        this.postRepository = new PostRepository();
    }

    public List<Post> getPosts(String name) {
        return this.postRepository.findPostsByUsername(name);
    }
}
