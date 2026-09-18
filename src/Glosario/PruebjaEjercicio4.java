package Glosario;

public class PruebjaEjercicio4 {
	public static void main(String[] args) {
		
		GlosarioTexto gt = new GlosarioTexto();
		
		gt.procesarParrafo("El reciclaje es importante para el planeta. El PLANETA necesita que reciclemos más,"
				+ " porque el reciclaje reduce la basura. La basura, cuando no se recicla,"
				+ " contamina ríos y océanos. Reciclar es fácil: separa el plástico, el vidrio y el papel. El plástico "
				+ "tarda años en degradarse, por eso reciclar plástico es tan importante. ¡Recicla hoy, recicla siempre!");
		
		System.out.println("Cantidad de palabras distintas: " + gt.contarPalabrasDiferentes());
		
		System.out.println("cantidad de veces que se dijo reciclar: " + gt.buscarFrecuencia("reciclar"));
		
		gt.mostrarVocabulario();
	}
	
	
}
