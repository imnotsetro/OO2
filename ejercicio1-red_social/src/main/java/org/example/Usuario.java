package org.example;
import java.util.List;

public class Usuario {
    private String screenName;
    private List<Post> tweets;

    public void borrarTweets() {
        this.tweets.clear();
    }

    public boolean eliminarUsuario(String name){
        if (this.screenName.equals(name)){
            this.tweets.clear();
            return true;
        } else {
            return false;
        }
    }
}
