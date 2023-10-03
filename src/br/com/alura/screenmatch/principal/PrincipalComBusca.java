package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PrincipalComBusca {

    public static void main(String[] args) throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.omdbapi.com/?t=shrek&apikey=6585022c"))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body().toUpperCase());

        String Json = response.body(); //retorno api
        Gson gson = new GsonBuilder() //objeto json com politica de formatacao
        .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
        .create();

        TituloOmdb tituloOmbd = gson.fromJson(Json,TituloOmdb.class); //carregando dados em record
        System.out.println(tituloOmbd);



        Titulo meuTitulo = new Titulo(tituloOmbd);  //carregando record em objeto
        System.out.println("Titulo já convertido");
        System.out.println(meuTitulo.toString());
    }

}
