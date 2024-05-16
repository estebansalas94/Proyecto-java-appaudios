package com.poojava.audios.modelos;

public class MisFavoritos {
    public void adicione(Audio audio){
        if(audio.getClasificacion() >= 8){
            System.out.println(audio.getTitulo() + " Es uno de los favoritos del momento");
        } else {
            System.out.println(audio.getTitulo() + " Tambien es uno de los favoritos");
        }
    }
}
