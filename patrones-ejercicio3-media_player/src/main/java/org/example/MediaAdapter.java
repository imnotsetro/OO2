package org.example;

public class MediaAdapter extends VideoStream {
    private MediaPlayer mp;

    @Override
    public void reproduce() {
        super.reproduce();
        mp.play();
    }
}
