package Inventario.Supermercado;

public class Producto {
	
	private String codigo;
	private int cantidadDisponible;
	private String nombre;

	public Producto(String codigo, int cantidadDisponible, String nombre) {
		this.codigo = codigo;
		this.cantidadDisponible = cantidadDisponible;
		this.nombre = nombre;
	}
	
	public String getCodigo() {return codigo;}
	
	public String getNombre() { return nombre;}
	
	public int getCantidadDisponible() {return cantidadDisponible;}

	public boolean actualizarStock(int cambio) {
		this.cantidadDisponible = cambio;
		System.out.println("Se actualizo el stock...");
		return true;
	}
	
	@Override
	public String toString() {
		return nombre + "; Codigo: " + codigo + " ; Cantidad disponible: " + cantidadDisponible;
	}
}
