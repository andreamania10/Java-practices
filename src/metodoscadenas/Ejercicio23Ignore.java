package metodoscadenas;

public class Ejercicio23Ignore {

	int indexOfIgnoreCase (String txt1, String txt2) {
		String texto1 = txt1.toLowerCase();
		String texto2 = txt2.toLowerCase(); 
	
		
		int posicionPrimeraOcurrencia = texto1.indexOf(texto2);

	
		int posicionSegundaOcurrencia = texto1.indexOf(texto2, posicionPrimeraOcurrencia +1 ); 
		return posicionSegundaOcurrencia;
}  
		
	public static void main(String[] args) {
		Ejercicio23Ignore i = new Ejercicio23Ignore();
		int resultado = i.indexOfIgnoreCase("casa", "a");
		System.out.println(resultado);
		
	}

}

//Buscar donde aparece la letra con el IndexOf, (primera ocurrencia) substring desde esa posoición hasta el final. 