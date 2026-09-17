package Historial.transacciones.cajero.automatico;

//Felipe Sanin
//Samuel rojas
//Daniel Berruecos

public class PruebaEjercicio01 {

	public static void main(String[] args) {

		CajeroAutomatico cajero1 = new CajeroAutomatico();
		
		cajero1.registrarMovimiento("Retiro", 2000);
		cajero1.registrarMovimiento("Abono", 5000);
		cajero1.registrarMovimiento("Retiro", 3455);
		cajero1.registrarMovimiento("Abono", 2333);
		
		cajero1.mostrarUltimoMovimiento();
		
		
		CajeroAutomatico cajero2 = new CajeroAutomatico();
		
		cajero2.registrarMovimiento("Bono", 5000);
		cajero2.registrarMovimiento("Retiro",4500);
		cajero2.registrarMovimiento("Bono",2432);
		cajero2.registrarMovimiento("Retiro",30045);
		
		cajero2.mostrarUltimoMovimiento();
		
		System.out.println("Cantidad totales de movimientos: " +CajeroAutomatico.contarMovimientos());
	}
	

}
