package arrays;

public class Ejercicio4 {

	int getFirstElement (int num1, int num2){
		int [] primerElemento = {num1, num2};
		
		return primerElemento[0];
		
		
	}
	public static void main(String[] args) {
		Ejercicio4 m = new Ejercicio4(); 
		int res = m.getFirstElement(1, 2);
		System.out.println(res);
		
	}

}
