package main.Ejercicio17;

public class Lavadora extends Electrodomestico{
    private static final Integer CARGA_DEFECTO=5;
    private Integer carga;

    public Lavadora() {
        super();
        this.carga = CARGA_DEFECTO;
    }

    public Lavadora(Double precioBase, Double peso) {
        super(precioBase, peso);
        this.carga=CARGA_DEFECTO;
    }

    public Lavadora(Double precioBase, String color, Character consumoEnergetico, Double peso, Integer carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void precioFinal(){
        super.precioFinal();
        if(this.carga > 30){
            this.setPrecioBase(this.getPrecioBase()+50);
        }
    }


}

