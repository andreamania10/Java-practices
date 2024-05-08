package metodos;

public class Ejercicio18 {
	
	 boolean nand (boolean boolean1, boolean boolean2) {
		return !boolean1==boolean2&&!boolean2==boolean1; 
	}

	public static void main(String[] args) {
		Ejercicio18 i = new Ejercicio18(); 
		boolean resultado = i.nand(false, false);
		System.out.println(resultado);
		boolean resultado2 = i.nand(true, false);
		System.out.println(resultado2);
		boolean resultado3 = i.nand(false, true);
		System.out.println(resultado3);
		boolean resultado4 = i.nand(true, true);
		System.out.println(resultado4);
	}

}
