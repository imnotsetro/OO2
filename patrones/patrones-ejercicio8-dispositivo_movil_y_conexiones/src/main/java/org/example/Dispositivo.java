package org.example;

public class Dispositivo {
    private Connection connection;
    private CRC_Calculator crc_calculator;
    private Display display;
    private Ringer ringer;

    public Dispositivo(Connection connection, CRC_Calculator crc_calculator, Display display, Ringer ringer) {
        this.connection = connection;
        this.crc_calculator = crc_calculator;
        this.display = display;
        this.ringer = ringer;
    }

    public String send(String data) {
        return this.connection.send(data, this.crc_calculator.crcFor(data));
    }

    public Connection getConnection() {
        return connection;
    }

    public void conectarCon(Connection connection) {
        this.connection = connection;
        System.out.println(this.display.showBanner(this.connection.pict()));
        this.ringer.ring();
    }

    public CRC_Calculator getCrc_calculator() {
        return crc_calculator;
    }

    public void configurarCRC(CRC_Calculator crc_calculator) {
        this.crc_calculator = crc_calculator;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Ringer getRinger() {
        return ringer;
    }

    public void setRinger(Ringer ringer) {
        this.ringer = ringer;
    }
}
