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

	
}
