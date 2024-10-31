import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorMoeda {
    private static final String API_KEY = System.getenv("EXCHANGE_RATE_API_KEY");
    private static final String API_URL = String.format("https://v6.exchangerate-api.com/v6/%s/latest/", API_KEY);

    public double obterTaxaDeCambio(String moedaOrigem, String moedaDestino) {
        String url = API_URL + moedaOrigem;
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();

            if (jsonObject.get("result").getAsString().equals("success")) {
                JsonObject rates = jsonObject.getAsJsonObject("conversion_rates");
                return rates.get(moedaDestino).getAsDouble();
            } else {
                throw new RuntimeException("Erro ao obter as taxas de câmbio.");
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro na requisição para a API de câmbio: " + e.getMessage());
        }
    }
}
