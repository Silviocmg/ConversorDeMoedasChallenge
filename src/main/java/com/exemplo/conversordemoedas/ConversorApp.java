package com.exemplo.conversordemoedas;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;
import java.util.Scanner;

public class ConversorApp {

    public static void main(String[] args) {
        
        ExchangeRateClient apiClient = new ExchangeRateClient();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CONVERSOR DE MOEDAS ===");
        System.out.println("Bem-vindo ao conversor de moedas!");

        try {
            
            System.out.print("Digite a moeda de origem (ex: USD, BRL, EUR): ");
            String moedaOrigem = scanner.nextLine().toUpperCase();

            
            ExchangeRateResponse taxas = apiClient.obterTaxasDeCambio(moedaOrigem);

            
            if (!taxas.getResult().equals("success")) {
                System.out.println("Erro ao obter taxas de câmbio. Verifique o código da moeda e tente novamente.");
                return;
            }

            System.out.print("Digite a moeda de destino (ex: USD, BRL, EUR): ");
            String moedaDestino = scanner.nextLine().toUpperCase();

          
            Double taxaDestino = taxas.getConversionRate(moedaDestino);
            if (taxaDestino == null) {
                System.out.println("Moeda de destino inválida ou não disponível para conversão.");
                return;
            }

           
            System.out.print("Digite o valor a ser convertido: ");
            BigDecimal valor = new BigDecimal(scanner.nextLine());

           
            BigDecimal valorConvertido = valor.multiply(BigDecimal.valueOf(taxaDestino))
                    .setScale(2, RoundingMode.HALF_UP);

            
            System.out.println("\nResultado da conversão:");
            System.out.printf("%s %.2f = %s %.2f\n",
                    moedaOrigem, valor, moedaDestino, valorConvertido);

            
            System.out.println("\nTaxa de câmbio utilizada: 1 " + moedaOrigem + " = " +
                    taxaDestino + " " + moedaDestino);
            System.out.println("Data da última atualização: " + taxas.getTime_last_update_utc());
            System.out.println("Próxima atualização: " + taxas.getTime_next_update_utc());

        } catch (IOException | InterruptedException e) {
            System.out.println("Erro ao acessar a API de taxas de câmbio: " + e.getMessage());
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Valor inválido. Por favor, digite um número válido.");
        } finally {
            scanner.close();
        }
    }

    public static class ExchangeRateResponse {
        private String result;
        private String documentation;
        private String terms_of_use;
        private long time_last_update_unix;
        private String time_last_update_utc;
        private long time_next_update_unix;
        private String time_next_update_utc;
        private String base_code;
        private Map<String, Double> conversion_rates;



        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }

        public String getDocumentation() {
            return documentation;
        }

        public void setDocumentation(String documentation) {
            this.documentation = documentation;
        }

        public String getTerms_of_use() {
            return terms_of_use;
        }

        public void setTerms_of_use(String terms_of_use) {
            this.terms_of_use = terms_of_use;
        }

        public long getTime_last_update_unix() {
            return time_last_update_unix;
        }

        public void setTime_last_update_unix(long time_last_update_unix) {
            this.time_last_update_unix = time_last_update_unix;
        }

        public String getTime_last_update_utc() {
            return time_last_update_utc;
        }

        public void setTime_last_update_utc(String time_last_update_utc) {
            this.time_last_update_utc = time_last_update_utc;
        }

        public long getTime_next_update_unix() {
            return time_next_update_unix;
        }

        public void setTime_next_update_unix(long time_next_update_unix) {
            this.time_next_update_unix = time_next_update_unix;
        }

        public String getTime_next_update_utc() {
            return time_next_update_utc;
        }

        public void setTime_next_update_utc(String time_next_update_utc) {
            this.time_next_update_utc = time_next_update_utc;
        }

        public String getBase_code() {
            return base_code;
        }

        public void setBase_code(String base_code) {
            this.base_code = base_code;
        }

        public Map<String, Double> getConversion_rates() {
            return conversion_rates;
        }

        public void setConversion_rates(Map<String, Double> conversion_rates) {
            this.conversion_rates = conversion_rates;
        }


        public Double getConversionRate(String currencyCode) {
            if (conversion_rates == null || !conversion_rates.containsKey(currencyCode)) {
                return null;
            }
            return conversion_rates.get(currencyCode);
        }
    }
}
