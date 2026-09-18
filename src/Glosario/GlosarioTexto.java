package Glosario;

import java.util.HashMap;
import java.util.HashSet;

public class GlosarioTexto {
	
	private HashSet <String> palabrasUnicas;
	private HashMap <String, Integer> frecuencias;
	
	
	public GlosarioTexto() {
		this.palabrasUnicas = new HashSet();
		this.frecuencias = new HashMap();
		
	}
	
	public void procesarParrafo(String parrafo) {
		String[] texto = parrafo.toLowerCase().replaceAll("[^a-záéíóúñ ]", "").replaceAll("\\s+", " ").trim().split(" ");
		for (String palabra: texto) {
			palabrasUnicas.add(palabra);
			frecuencias.put(palabra, frecuencias.getOrDefault(palabra,0) + 1);
		}
	}
	
	public int contarPalabrasDiferentes() {
		return palabrasUnicas.size();
	}

	public int buscarFrecuencia(String palabra) {
		return frecuencias.get(palabra);
	}

	public void mostrarVocabulario() {
		System.out.println("==================================");
		System.out.println("||         VOCABULARIO          ||");
		System.out.println("==================================");
		for (String palabra : palabrasUnicas) {
			System.out.println("- " + palabra);
		}
		System.out.println("==================================");
	}
}
