package Historial.transacciones.cajero.automatico;

import java.util.ArrayList;

public class CajeroAutomatico {
	
	private ArrayList <Movimiento> historial;
	public static ArrayList <CajeroAutomatico> todosCajeros = new ArrayList();
	
	public CajeroAutomatico() {
		todosCajeros.add(this);
		this.historial = new ArrayList();
	}
	
	public void registrarMovimiento(String tipo, double valor) {
		Movimiento movimiento = new Movimiento(tipo,valor);
		historial.add(movimiento);
		System.out.println("Se registro exitosamente el movimiento");
	}
	
	public void mostrarUltimoMovimiento() {
		System.out.println("===========================");
		System.out.println("Ultimo movimiento:");
		System.out.println(historial.get(historial.size() - 1));
		System.out.println("===========================");
		
	}
	
	public static int  contarMovimientos() {
		int total = 0;
		for (CajeroAutomatico c: todosCajeros) {
			total += c.historial.size();
		}
		return total;
	}
	
	
}


