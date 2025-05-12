package org.example;
import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
            this.tweets.add(new Tweet(this, text));
        }
    }

    public void borrarTweets() {
        this.tweets.clear();
    }

    public String getScreenName() {
        return screenName;
    }

    public boolean eliminarUsuario(String name){
        if (this.screenName.equals(name)){
            this.tweets.clear();
            return true;
        } else {
            this.tweets.removeAll(this.tweets.stream().filter(t -> t.esDe(name)).collect(Collectors.toList()));
            return false;
        }
    }
}
