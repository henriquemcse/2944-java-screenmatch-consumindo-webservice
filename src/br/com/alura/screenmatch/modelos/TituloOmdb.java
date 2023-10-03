package br.com.alura.screenmatch.modelos;

import java.util.Arrays;

public record TituloOmdb(String title, String year, String runtime, String genre) {
    @Override
    public String toString() {
        return "TituloOmdb{" +
                "title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", runtime='" + runtime + '\'' +
                ", genre=" + genre +
                '}';
    }
}
