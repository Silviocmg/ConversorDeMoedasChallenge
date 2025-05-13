package com.exemplo.conversordemoedas;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.File;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.Gson;



public class ExchangeRateClient {
    private final HttpClient httpClient;
    private final String apiKey;
    private final String baseUrl;

    public ExchangeRateClient() {

        this.httpClient = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(10))
                .build();


        Properties env = loadEnvProperties();
        this.apiKey = env.getProperty("API_KEY");
        this.baseUrl = env.getProperty("BASE_URL") + apiKey + "/latest/";
    }


    private Properties loadEnvProperties() {
        Properties properties = new Properties();


        try (InputStream input = new FileInputStream(".env")) {
            properties.load(input);
        } catch (IOException e) {
            System.err.println("Erro ao carregar arquivo .env: " + e.getMessage());


            String apiKey = System.getenv("API_KEY");
            String baseUrl = System.getenv("BASE_URL");

            if (apiKey != null && baseUrl != null) {
                properties.setProperty("API_KEY", apiKey);
                properties.setProperty("BASE_URL", baseUrl);
            } else {
                throw new RuntimeException("Não foi possível carregar as configurações do ambiente", e);
            }
        }



        return properties;
    }


    public JsonObject obterTaxasDeCambioJson(String moedaBase) throws IOException, InterruptedException {

        String url = baseUrl + moedaBase;


        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Accept", "application/json")
                .GET()
                .build();


        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());


        if (response.statusCode() != 200) {
            throw new IOException("Erro na requisição: " + response.statusCode() + " - " + response.body());
        }


        return JsonParser.parseString(response.body()).getAsJsonObject();
    }


    public ExchangeRateResponse obterTaxasDeCambio(String moedaBase) throws IOException, InterruptedException {

        String url = baseUrl + moedaBase;


        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Accept", "application/json")
                .GET()
                .build();


        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());


        if (response.statusCode() != 200) {
            throw new IOException("Erro na requisição: " + response.statusCode() + " - " + response.body());
        }


        Gson gson = new Gson();
        return gson.fromJson(response.body(), ExchangeRateResponse.class);
    }
}
