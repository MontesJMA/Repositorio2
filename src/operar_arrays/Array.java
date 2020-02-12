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
	
public static int[] Hacerunarray(int longitud, int liminferior, int limsuperior) {
		
		int array[] = new int[longitud];
		
		for (int i = 0; i < array.length; i++) {
			
			array[i] = (int) Math.round(Math.random() * (limsuperior - liminferior) + liminferior);
		}
		
		return array;
	}


	
}
