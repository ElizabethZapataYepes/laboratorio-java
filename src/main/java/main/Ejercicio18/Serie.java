package main.Ejercicio18;

public class Serie implements Entregable{

    private static final Integer TEMPORADAS_POR_DEFECTO=3;
    private static final Boolean ENTREGADO_POR_DEFECTO=Boolean.FALSE;

    private String titulo,genero,creador;
    private Boolean entregado;
    private Integer numTemporadas;

    public Serie(){
        this.numTemporadas = TEMPORADAS_POR_DEFECTO;
        this.entregado = ENTREGADO_POR_DEFECTO;
    }

    public Serie(String titulo, String creador) {
        this();
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, String genero, String creador, Integer numTemporadas) {
        this(titulo,creador);
        this.genero = genero;
        this.numTemporadas = numTemporadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public Integer getNumTemporadas() {
        return numTemporadas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public void setNumTemporadas(Integer numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                ", entregado=" + entregado +
                ", numTemporadas=" + numTemporadas +
                '}';
    }

    @Override
    public void Entregar() {
        this.entregado = Boolean.TRUE;
    }

    @Override
    public void devolver() {
        this.entregado = Boolean.FALSE;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public void compareTo(Object a) {

    }
}

