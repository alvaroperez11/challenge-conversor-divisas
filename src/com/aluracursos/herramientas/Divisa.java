package com.aluracursos.herramientas;

import java.util.Map;

public record Divisa(String base_code, Map<String, Double> conversion_rates) {
}