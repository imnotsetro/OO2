package org.example;

public interface Connection {

    public String send(String data, Integer crc);

    public String pict();
}
