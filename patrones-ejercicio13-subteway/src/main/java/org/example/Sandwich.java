package org.example;

public class Sandwich {
    private Pan pan;
    private Aderezo aderezo;
    private Principal principal;
    private Adicional adicional;

    public Sandwich(Pan pan, Aderezo aderezo, Principal principal, Adicional adicional) {
        this.pan = pan;
        this.aderezo = aderezo;
        this.principal = principal;
        this.adicional = adicional;
    }

    public double getPrecio() {
        return pan.getPrecio() + aderezo.getPrecio() + principal.getPrecio() + adicional.getPrecio();
    }

    public static void main(String[] args) {
        // Clásico
        Sandwich clasico = new Sandwich(
                new PanBrioche(),
                new Mayonesa(),
                new CarneDeTernera(),
                new Tomate()
        );
        System.out.println("Clásico: " + clasico.getPrecio() + " pesos");

        // Vegetariano
        Sandwich vegetariano = new Sandwich(
                new PanConSemillas(),
                new SinAderezo(),
                new ProvoletaGrillada(),
                new BerenjenasAlEscabeche()
        );
        System.out.println("Vegetariano: " + vegetariano.getPrecio() + " pesos");

        // Vegano
        Sandwich vegano = new Sandwich(
                new PanIntegral(),
                new SalsaCriolla(),
                new MilanesaDeGirgolas(),
                new SinAdicional()
        );
        System.out.println("Vegano: " + vegano.getPrecio() + " pesos");

        // Sin TACC
        Sandwich sinTacc = new Sandwich(
                new PanChipa(),
                new SalsaTartara(),
                new Pollo(),
                new VerdurasGrilladas()
        );
        System.out.println("Sin TACC: " + sinTacc.getPrecio() + " pesos");
    }

}
