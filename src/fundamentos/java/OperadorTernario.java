package fundamentos.java;

public class OperadorTernario {
	
	public static void main(String[] args) {
	//Ejercicio 1
		int b = 10; 
		
		String resultado = (b>0)?"b es positivo":"b es negativo";
		System.out.println(resultado);
	
	//Ejercicio 2
		int i = 5; 
		String resultado2 = (i%2 == 0)?"i es par":"i es impar";
		System.out.println(resultado2);
	
	//Ejercicio Operador comparar dos cadenas de texto
		String cadena1 = new String("Hola"); 
		String cadena2 = new String("Hola"); 
		String cadena3 = "Adios";
		String cadena4 = "Adios"; 
	
		if(cadena1.equals(cadena2)) {
			System.out.println("Son iguales");
		}else {
			System.out.println("Son distintos"); 
		}
		
		if(cadena3 == cadena4) {
			System.out.println("Son iguales"); 
		}else {
			System.out.println("Son distintos");
		}
	}
	

}
