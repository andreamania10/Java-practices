package metodoscadenas;

public class Ejercicio18contador {

	String contadorDeLetras2 (String txt1, String txt2, String letra) {
		int contadortxt1 = 0;
		int contadortxt2 = 0; 
		
		
		for(int i = 0; i<txt1.length(); i++) {	
			if(txt1.substring(i, i+1).equals(letra)) {
				contadortxt1++;
			}
	
		}	
		for(int j = 0; j<txt2.length(); j++) {
			if(txt2.substring(j, j+1).equals(letra)) {
				contadortxt2++;
			}
			
			
		}  
		
		if(contadortxt1>contadortxt2) {
			return txt1;
		} else {
			return txt2; 
		}
	}
	
	public static void main(String[] args) {
		Ejercicio18contador i = new Ejercicio18contador(); 
		String resultado = i.contadorDeLetras2("Andrea", "Maria", "e");
		System.out.println(resultado);
	}

}
