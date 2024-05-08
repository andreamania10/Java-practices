package booleanos;

public class Velocidad {
	void recoger () {
		int velocidadKm = 40; 
		int velocidadM = velocidadKm*1000; 
		System.out.println("Velocidad en kilómetros: " + velocidadKm);
		System.out.println("Velocidad en metros: " + velocidadM);
	}
	public static void main(String[] args) {
		Velocidad i = new Velocidad(); 
		i.recoger();
	}

}
