package operar_arrays;

public class Array {

	public static void main(String[] args) {

		
	}
	
	public static void rellenar_array() {
		
		int array[] = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.round(Math.random() * (20 - 1)) + 1);
		}
		
	}
	
	public static void imprimir_array (int[] array) {
		System.out.println("Contenido del array");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static void sumar_array(int[] array) {
		int suma;
		suma = array[0];
		
		for (int i = 1; i < array.length; i++) {
			suma += array[i];
			
		}
	}
	
	public static void ordenaArray (int array[]) {
		boolean hayIntercambios;
		do {
			hayIntercambios = false;
			// Empieza el algoritmo
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i+1] < array[i]) {
					// Entonces hago un intercambio
					int aux = array[i+1];
					array[i+1] = array[i];
					array[i] = aux;
					hayIntercambios = true;
				}
			}
		} while (hayIntercambios);

	}


	
}
