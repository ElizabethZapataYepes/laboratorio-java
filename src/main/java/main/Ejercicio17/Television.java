package main.Ejercicio17;

public class Television extends Electrodomestico {
    private Integer resolucion;
    private Boolean sintonizadorTDT;
    private static final Integer RESOLUCION_DEFECTO = 20;
    private static final Boolean SINTONIZADORTDT_DEFECTO = Boolean.FALSE;

    public Television() {
        super();
        this.resolucion = RESOLUCION_DEFECTO;
        this.sintonizadorTDT = SINTONIZADORTDT_DEFECTO;
    }

    public Television(Double precioBase, Double peso) {

        super(precioBase, peso);
        this.resolucion = RESOLUCION_DEFECTO;
        this.sintonizadorTDT = SINTONIZADORTDT_DEFECTO;

    }

    public Television(Double precioBase, String color, Character consumoEnergetico, Double peso, Integer resolucion, Boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public Boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void precioFinal() {
        super.precioFinal();
        Double precio = this.getPrecioBase();
        if (this.getResolucion() > 40) {
            precio += precio * 0.3;
        }
        if (this.getSintonizadorTDT()) {
            precio += 50;
        }
        this.setPrecioBase(precio);
    }
}

