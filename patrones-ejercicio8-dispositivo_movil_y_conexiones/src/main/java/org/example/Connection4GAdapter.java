package org.example;

public class Connection4GAdapter implements Connection{
    private Connection4G connection4G;

    public Connection4GAdapter(String symb) {
        this.connection4G = new Connection4G(symb, this);
    }

    @Override
    public String send(String data, Integer crc) {
        return data+crc;
    }

    @Override
    public String pict() {
        return connection4G.getSymb();
    }

    public Connection4G getConnection4G() {
        return connection4G;
    }

    public void setConnection4G(Connection4G connection4G) {
        this.connection4G = connection4G;
    }
}
