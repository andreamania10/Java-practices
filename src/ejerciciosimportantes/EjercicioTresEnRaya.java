package ejerciciosimportantes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioTresEnRaya {
	static void printBoard(String[] guionesBajos) {
		System.out.println("|" + guionesBajos[0] + "|" + guionesBajos[1] + "|" + guionesBajos[2] + "|");
		System.out.println("|" + guionesBajos[3] + "|" + guionesBajos[4] + "|" + guionesBajos[5] + "|");
		System.out.println("|" + guionesBajos[6] + "|" + guionesBajos[7] + "|" + guionesBajos[8] + "|");

	}

	static void juegaPlayer(String[] guionesBajos, String ficha) throws NumberFormatException, IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("En qué posición te quieres poner, jugador " + ficha + " ?");
			int position = Integer.parseInt(br.readLine());
			guionesBajos[position] = ficha;
	}

	static boolean evaluateGanador(String [] guionesBajos) {
		if(guionesBajos[0].equals(guionesBajos[1]) && guionesBajos[0].equals(guionesBajos[2]) && !guionesBajos[0].equals("_")) {
			return true; 
		} else if(guionesBajos[3].equals(guionesBajos[4]) && guionesBajos[3].equals(guionesBajos[5]) && !guionesBajos[3].equals("_")) {
			return true; 
		} else if (guionesBajos[6].equals(guionesBajos[7]) && guionesBajos[6].equals(guionesBajos[8]) && !guionesBajos[6].equals("_")) {
			return true; 
		} else if (guionesBajos [0].equals(guionesBajos[3]) && guionesBajos[0].equals(guionesBajos[6]) && !guionesBajos[0].equals("_")) {
			return true; 
		} else if (guionesBajos [1].equals(guionesBajos[4]) && guionesBajos[1].equals(guionesBajos[7]) && !guionesBajos[1].equals("_")) {
			return true; 
		} else if (guionesBajos [2].equals(guionesBajos[5]) && guionesBajos[2].equals(guionesBajos[8]) && !guionesBajos[2].equals("_")) {
			return true; 
		} else if (guionesBajos [3].equals(guionesBajos[6]) && guionesBajos[3].equals(guionesBajos[6]) && !guionesBajos[3].equals("_")) {
			return true; 
		} else if (guionesBajos [0].equals(guionesBajos[4]) && guionesBajos[0].equals(guionesBajos[8]) && !guionesBajos[0].equals("_")) {
			return true; 
		} else if (guionesBajos [2].equals(guionesBajos[4]) && guionesBajos[2].equals(guionesBajos[6]) && !guionesBajos[2].equals("_")) {
			return true; 
		}
		return false; 
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		String[] guionesBajos = { "_", "_", "_", "_", "_", "_", "_", "_", "_" };
		int tirada = 0;
		boolean juegoGanado = false;
		String ficha;

		do {
			printBoard(guionesBajos);
			ficha = tirada % 2 == 0 ? "X" : "O";	
			juegaPlayer(guionesBajos, ficha);
		juegoGanado = evaluateGanador(guionesBajos); 
		if(juegoGanado) {
			System.out.println("Enhorabuena, player " + ficha);
		}
		tirada ++; 
		} while(!juegoGanado && tirada <9);
		
		printBoard(guionesBajos);
		if(!juegoGanado) {
			System.out.println("El juego ha terminado en empate");
		}
		
		}
}
