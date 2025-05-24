package org.example.parte2A;

import java.util.logging.Logger;

public class WallPostImpl implements WallPost {
    private String text;
    private int likes;
    private boolean isFeatured;
    private Logger modelLogger;

    public WallPostImpl(Logger modelLogger) {
        this.text = "Undefined post";
        this.modelLogger = modelLogger;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public int getLikes() {
        return likes;
    }

    @Override
    public void like() {
        this.likes++;
        if (likes == 10) {
            modelLogger.warning("La cantidad de likes llegó a 10.");
        }
    }

    @Override
    public void dislike() {
        if (likes > 0) {
            this.likes--;
            if (likes == 0) {
                modelLogger.warning("La cantidad de likes llegó a 0.");
            }
        }
    }

    @Override
    public boolean isFeatured() {
        return isFeatured;
    }

    @Override
    public void toggleFeatured() {
        this.isFeatured = !this.isFeatured;
    }

    @Override
    public String toString() {
        return "WallPost {" + "text: " + getText() + ", likes: '" + getLikes() + "'" + ", featured: '" + isFeatured() + "'" + "}";
    }
}