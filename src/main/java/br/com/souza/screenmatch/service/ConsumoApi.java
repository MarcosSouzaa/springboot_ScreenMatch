package br.com.souza.screenmatch.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoApi {

    public String obterDados(String endereco) {

        //como se fosse o cliente
        HttpClient client = HttpClient.newHttpClient();

        // onde eu crio uma uri para dizer para qual endereço
        // vou fazer a requisição
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        // Depois disso, preciso tentar receber essa resposta
        HttpResponse<String> response = null;
        try {
            // meu client vai mandar essa requisição
            // e eu vou receber essa resposta
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // o que interessa é essa String receber o corpo
        // dessa resposta.
        String json = response.body();
        return json;

        // O Try catch é porque pode acontecer algum erro. Posso
        // Enviar o endereço errado, então ele precisa lançar a excessão
        // para entendermos que houve um erro ali.
    }

}

