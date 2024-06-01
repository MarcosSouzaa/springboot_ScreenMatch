package br.com.souza.screenmatch.service;

import br.com.souza.screenmatch.model.DadosSerie;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverteDados implements iConverteDados{
    private ObjectMapper mapper = new ObjectMapper();


    @Override
    public <t> t obterDados(String json, Class<t> classe) {

        //passamos mapper que é o objeto do Jackson que faz a conversão
        try {
            return mapper.readValue(json, classe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }
}
