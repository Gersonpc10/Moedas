package Conversor;

import java.util.Map;

public record MoedaRecebida(String result, String baseCode, Map<String, Double> conversionRates) {
}


//result: Uma string que representa o resultado da operação de conversão. Pode conter informações sobre o sucesso ou falha da operação.
//baseCode: Uma string que representa o código da moeda base utilizada na conversão. Por exemplo, "USD" para dólar americano.
//conversionRates: Um mapa que armazena as taxas de conversão para diferentes moedas. As chaves do mapa são os códigos das moedas (por exemplo, "BRL" para real brasileiro) e os valores são as taxas de conversão em relação à moeda base.