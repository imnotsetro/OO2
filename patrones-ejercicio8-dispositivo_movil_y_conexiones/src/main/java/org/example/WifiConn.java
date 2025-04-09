package org.example;

public class WifiConn implements Connection{
    private String pict;

    public WifiConn(String pict) {
        this.pict = pict;
    }

    public String getPict() {
        return pict;
    }

    public String send(String data, Integer crc) {
        return pict+crc;
    }

    public String pict() {
        return pict;
    }
}
