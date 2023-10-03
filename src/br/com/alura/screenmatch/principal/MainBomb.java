package br.com.alura.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MainBomb {
    public static void main(String[] args) throws IOException, InterruptedException {
        String nome = "sunda";
        System.out.println(nome.hashCode());
        nome = "joao";
        System.out.println(nome.hashCode());
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create("https://rapid-sms-api.p.rapidapi.com/service-status"))
//                .header("X-RapidAPI-Key", "566869f59cmsh347aa570fa0d85ep115a4cjsnc797b5ac143b")
//                .header("X-RapidAPI-Host", "rapid-sms-api.p.rapidapi.com")
//                .method("GET", HttpRequest.BodyPublishers.noBody())
//                .build();
//        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
//        System.out.println(response.body());
    }
}
