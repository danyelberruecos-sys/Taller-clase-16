package Inventario.Supermercado;

import java.util.HashMap;

public class InventarioSupermercado {
	private HashMap <String,Producto> productosPorCodigo;
	
	public InventarioSupermercado() {
		this.productosPorCodigo = new HashMap();
	}
	
	public boolean RegistrarProducto(Producto producto) {
		
		productosPorCodigo.put(producto.getCodigo(), producto);
		System.out.println("Se registro exitosamente...");
		return true;
	}
	
	public boolean actualizarStock(String codigo, int cambio) {
		productosPorCodigo.get(codigo).actualizarStock(cambio);
		return true;
	}
	
	public  int buscarCantidad(String codigo) {
		int cantidad = 0;
		cantidad = productosPorCodigo.get(codigo).getCantidadDisponible();
		return cantidad;
	}
	
	public void mostrarInventario() {
		System.out.println("========================================");
		System.out.println("||              INVETARIO             ||");
		System.out.println("========================================");
		if (productosPorCodigo.size() == 0) {
			System.out.println("No hay productos registrados...");
		}else {
			for (Producto p : productosPorCodigo.values()) {
				System.out.println(p);
			}
		}
	}
}
