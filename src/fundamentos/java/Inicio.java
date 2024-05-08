package fundamentos.java;

public class Inicio{
	
	void saludar (boolean valor) {
		if(valor == true) {
			System.out.println("Sí, eso es cierto");
		} else {
			System.out.println("No, eso es falso");
			valor = false; 
		}
	}
	public static void main(String[] args) {
		Inicio i = new Inicio(); 
		i.saludar(false);
	}
}