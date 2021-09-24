package beans;

import org.springframework.beans.factory.annotation.Value;

public class Saludo {
    @Value("Adios Cesar!!")
    private String Mensaje;

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }
}
