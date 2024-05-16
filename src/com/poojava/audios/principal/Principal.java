package com.poojava.audios.principal;

import com.poojava.audios.modelos.Cancion;
import com.poojava.audios.modelos.MisFavoritos;
import com.poojava.audios.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Gabriela Aguilar");
        miPodcast.setTitulo("Cafe.Tech");

        //me gustas y reproducciones de canciones
        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 2000; i++) {
            miCancion.reproduce();
        }

        //me gustas y reproducciones de podcast
        for (int i = 0; i < 100; i++) {
            miPodcast.meGusta();
        }
        for (int i = 0; i < 8000; i++) {
            miPodcast.reproduce();
        }

        System.out.println("El total de reproducciones de la cancion "+ miCancion.getTitulo() + " es: " + miCancion.getTotalDeReproducciones() + " Reproducciones");
        System.out.println("El total de me gustas de la cancion "+ miCancion.getTitulo() + " es: " + miCancion.getTotalDeMeGusta() + " Like");

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicione(miPodcast);
        favoritos.adicione(miCancion);
    }
}
