package fundamentos.java;

public class Main {

	public static void main(String[] args) {
		//Ejercicio 1,2,3
		int i = 6;
		System.out.println(i);
		String nombre = "Andrea";
		System.out.println(nombre);
		double d = 10.5;
		
		//Ejercicio 4
		int a = 7;
		int b = a;
		System.out.println(b);
		
		//Ejercicio 5
		String tituloDeLaPelicula; 
		String  camelCaseBienPuesto; 
		int EdadDelMonstruo;
		
		//Ejercicio 6
		int j = 7;
		j = 5;
		j = 3;
		System.out.println(j); //3
		
		//Ejercicio 7
		int p = 5; 
		double v = 4.13d; 
		char c = 'c'; 
		System.out.println(p);
		System.out.println(v);
		System.out.println(c);
		
		//Ejercicio 8
		int e = 5;
		int f = 7;
		int g; 
		
		g = f; 
		f = e; 
		e = g; 
		System.out.println(e); //Debería mostrar 7
		System.out.println(f); //Debería mostrar 5
		
		//Ejercicio cocatenación
		String nom = "Jose";
		System.out.println("Buenas tardes" + " " + nom);
		
		//Ejercicio operadores aritméticos
		//Ejercicio 1
		String cadena = "Este es el principio"; 
		String cadena2 = "Este es el final";
				System.out.println(cadena + ". " + cadena2);
		
		//Ejercicio 2
		int euros = 7;
		int dolares = euros * 2;
		System.out.println(dolares);
		
		//Ejercicio 3
		float precio = 100f; 
		float precioConIva = precio * 0.21f; 
		System.out.println(precioConIva); 
		
		//Ejercicio 4
		int ancho = 4; 
		int alto = 7; 
		
		System.out.println(ancho * alto);
		
		//Ejercicio 5
		float centigrados= 20f;
		float fahrenheit= centigrados * 9/5 + 32;
		System.out.println(fahrenheit); // Debería mostrar 68
		
		//Ejercicio 6
		String name = "Juan";
		String material = "madera";
		String dimensiones = "diminutas";
		String comentario = "Que sea bonita, pero de una belleza estraña, indómita";
		System.out.println(name + " ha pedido una caja de " + material + " con unas dimensiones " + dimensiones + ". " + comentario + ".");
		
		//Sugar sintax
		//Ejercicio 1
		int myVar = 87;
		myVar = myVar++;
		
		//Ejercicio 2
		int myVar2 = 11;
		myVar2 = myVar2--;
		
		//Ejercicio 3
		int x = 3; 
		x++; 
		x = x * 2; 
		x--; 
		System.out.println(x); //7
	}
}