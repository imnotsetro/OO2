package org.example;
import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String screenName;
    private List<Post> tweets;

    public Usuario(String screenName) {
        this.screenName = screenName;
        this.tweets = new ArrayList<>();
    }

    public List<Post> getTweets() {
        return tweets;
    }

    public void crearTweet(String text){
        if (text.length() <= 280){
            this.tweets.add(new Tweet(text));
        }
    }

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
