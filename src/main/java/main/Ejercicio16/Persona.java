package main.Ejercicio16;

public class Persona {
    private String nombre;
    private Integer edad;
    private Integer DNI;
    private Double peso;
    private Double altura;
    private Character sexo;
    private static final Integer BAJO_PESO = -1;
    private static final Integer PESO_IDEAL = 0;
    private static final Integer SOBRE_PESO = 1;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.peso = 0.0;
        this.altura = 0.0;
        this.sexo = 'H';
        generarID();
    }

    public Persona(String nombre, Integer edad, Character sexo) {
        this();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        comprobarSexo(this.getSexo());
    }

    public Persona(String nombre, Integer edad, Double peso, Double altura, Character sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
        comprobarSexo(this.getSexo());
        generarID();
    }

    /**
     * @return
     */
    public Integer calcularIMC() {
        Double imc = this.getPeso() / (Math.pow(this.getAltura(), 2));
        if (imc < 20) {
            return BAJO_PESO;
        } else if (imc >= 20 && imc <= 25) {
            return PESO_IDEAL;
        } else {
            return SOBRE_PESO;
        }

    }


    public Boolean esMayorDeEdad() {
        if (this.getEdad() >= 18) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }

    }


    private void comprobarSexo(Character sexo) {
        sexo = Character.toUpperCase(sexo);
        if (sexo.equals('H') || sexo.equals('M')) {
            this.sexo=sexo;
        } else {
            this.sexo='H';
        }

    }


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI=" + DNI +
                ", peso=" + peso +
                ", altura=" + altura +
                ", sexo=" + sexo +
                '}';
    }

    public void generarID() {
        Integer dni = (int) (Math.random() * 100000000);
        this.DNI = dni;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Integer getEdad() {
        return edad;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
        comprobarSexo(sexo);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}

