package org.example;

public class Connection4G {
    private String symb;
    private Connection4GAdapter adapter;

    public Connection4G(String symb, Connection4GAdapter adapter) {
        this.symb = symb;
        this.adapter = adapter;
    }

    public String getSymb() {
        return symb;
    }

    public void setSymb(String symb) {
        this.symb = symb;
    }

    public Connection4GAdapter getAdapter() {
        return adapter;
    }

    public void setAdapter(Connection4GAdapter adapter) {
        this.adapter = adapter;
    }

    public String trasmit(String data, Integer crc){
        this.adapter.send(data, crc);
        return "Data sent";
    }

}
