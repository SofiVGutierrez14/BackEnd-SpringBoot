
package com.ProyectoSVG.Sofi.Security.Controller;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Mensaje {
    private String mensaje;
    
    //constructor

    public Mensaje() {
    }

    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
}
