package Inventario.Supermercado;

public class PruebaEjercicio3 {

	public static void main(String[] args) {
		
		Producto p1 = new Producto("MQ1", 12, "Mantequilla");
		Producto p2 = new Producto("AP2", 17, "Arepa");
		Producto p3 = new Producto("QT3", 8, "Quesito");
		Producto p4 = new Producto("HV4", 24, "Huevo");
		
		InventarioSupermercado isp = new InventarioSupermercado();
		
		isp.RegistrarProducto(p1);
		isp.RegistrarProducto(p2);
		isp.RegistrarProducto(p3);
		isp.RegistrarProducto(p4);
		
		isp.actualizarStock("AP2", 16);
		System.out.println("Cantidad Arepas: " + isp.buscarCantidad("AP2"));
		
		isp.mostrarInventario();
	}
	
}
