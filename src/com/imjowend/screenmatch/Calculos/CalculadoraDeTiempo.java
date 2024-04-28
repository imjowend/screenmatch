package com.imjowend.screenmatch.Calculos;
import com.imjowend.screenmatch.Modelos.Pelicula;
import com.imjowend.screenmatch.Modelos.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo){
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }
}
