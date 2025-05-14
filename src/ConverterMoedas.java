import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConverterMoedas {

    public Informacoes fazerConversao (String primeiraMoeda, String segundaMoeda, double valor){

        String chave = "9de205f4009541c394832a52";
        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/"+ chave + "/pair/" + primeiraMoeda + "/" + segundaMoeda + "/"+ valor);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Informacoes.class);
        } catch (Exception e) {
            throw new RuntimeException("Pensando no erro");
        }
    }

}
