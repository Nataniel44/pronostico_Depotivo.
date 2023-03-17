package equipo;
public class Equipos {
    private String nombreEquipo;
    private int cantidadGoles;
    public void setNombreEquipo(String nombreEquipo){
        this.nombreEquipo=nombreEquipo;
        }
    public String getNombreEquipo(){
        return nombreEquipo;
    }
    public void setCantidadGoles(int cantidadGoles) {
        this.cantidadGoles = cantidadGoles;
    }

    public int getCantidadGoles() {
        return cantidadGoles;
    }

}

