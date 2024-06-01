package br.com.souza.screenmatch.service;

public interface iConverteDados {

    // Ele receberá um json, que é uma string, uma classe e no
    // conversor de dados tentaremos transformá-lo na classe que foi indicada

   <t> t obterDados(String json, Class<t> classe);
}
