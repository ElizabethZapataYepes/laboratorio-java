package main.Ejercicio18;

public class VideoJuego implements Entregable {

    private static final Integer HORAS_ESTIMADAS=10;
    private static final Boolean ENTREGADO_POR_DEFECTO=Boolean.FALSE;

    private String titulo,genero,compania;
    private Boolean entregado;
    private Integer horasEstimadas;

    public VideoJuego() {
        this.horasEstimadas = HORAS_ESTIMADAS;
        this.entregado = ENTREGADO_POR_DEFECTO;
    }

    public VideoJuego(String titulo, Integer horasEstimadas) {
        this();
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public VideoJuego(String titulo, String genero, String compania, Integer horasEstimadas) {
        this(titulo,horasEstimadas);
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public Integer getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(Integer horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
                ", entregado=" + entregado +
                ", horasEstimadas=" + horasEstimadas +
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

