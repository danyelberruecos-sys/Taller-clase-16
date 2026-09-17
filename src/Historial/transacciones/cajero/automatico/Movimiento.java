package Historial.transacciones.cajero.automatico;

public class Movimiento {

	
		private String tipo;
		private double valor;
		
		public Movimiento(String tipo, double valor) {
			this.tipo = tipo;
			this.valor = valor;
		}
		
		public String getTipo() {return tipo;}
		
		public double getValor() {return valor;}
		
		@Override
		public String toString() {
			return tipo + ". Valor de retiro: $" + valor;
		}
}
