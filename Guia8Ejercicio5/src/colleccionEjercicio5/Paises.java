package colleccionEjercicio5;

public class Paises {
    
private String nombrePais;

    public Paises() {
    }

    public Paises(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    @Override
    public String toString() {
        return nombrePais;
    }

}
