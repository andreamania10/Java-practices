package repaso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioCosteViaje {

	int costeHotel(int noches) {
		int costeNoche = 140; 
		return costeNoche * noches; 
	}
	
	Integer costeAvion(String destino) {
		if (destino.toLowerCase().equals("oviedo")) {
			return 15;  
		} else if (destino.toLowerCase().equals("tokio")) {
			return 700; 
		} else if (destino.toLowerCase().equals("madrid") || destino.toLowerCase().equals("barcelona")) {
			return 90; 
		}
		return null;
	}

	
	int costeAlquilerCoche(int noches) {
		int precioAlquiler = 40; 
		if (noches >= 7) {
			return noches * precioAlquiler - 50;	
		} else if (noches >= 3) {
			return noches * precioAlquiler - 20; 
		} else {
			return noches * precioAlquiler; 
		}
		
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Introduzca el número de noches: ");
	    int numNoches = Integer .parseInt(br.readLine()); 
	    System.out.println("Introduce el destino: oviedo, tokio, madrid o barcelona");
	    String costeViaje = br.readLine().toLowerCase(); 
	    System.out.println("Introduce cuantos días necesitas el coche, por favor");
	    int diasAlquiler = Integer .parseInt(br.readLine());
	    
	    EjercicioCosteViaje i = new EjercicioCosteViaje(); 
	    int resultadoHotel = i.costeHotel(numNoches); 
	    System.out.println("Precio total noches en el hotel: " + resultadoHotel);
	    int resultadoLocalizacion = i.costeAvion(costeViaje); 
	    System.out.println("Precio del viaje en avión: " + resultadoLocalizacion);
	    int resultadoAlquiler = i.costeAlquilerCoche(numNoches);
	    System.out.println("Precio total alquiler del coche: " + resultadoAlquiler);
	    int  sumaCostes = numNoches + diasAlquiler;
	    System.out.println("Coste total: " + sumaCostes);

	}

}
