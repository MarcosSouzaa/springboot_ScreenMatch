package br.com.souza.screenmatch;

import br.com.souza.screenmatch.model.DadosSerie;
import br.com.souza.screenmatch.service.ConsumoApi;
import br.com.souza.screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//ConsumoApi consumoApi = new ConsumoApi();
		// vou fazer a mesma coisa abaixo usando o tipo var
		var consumoAPI = new ConsumoApi();
		var json = consumoAPI.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");
		System.out.println(json);

		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);

	}
}
