package tabuada;

public class Main {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		for(int obj : array) {
			for (int obj2 : array) {
				System.out.println(" Obj: " + obj + " Obj2: " + obj2 + " Resultado: " + (obj * obj2));
			}
		}
	}

}
