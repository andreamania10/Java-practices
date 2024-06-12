package ejerciciosimportantes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioAhorcado {

	static String getPalabraSecreta() throws IOException {
		String[] palabras = { "casa", "mazmorra", "puerta", "nenufar" };

		int posicionAleatoria = (int) Math.floor(Math.random() * palabras.length);
		String palabraSecreta = palabras[posicionAleatoria];

		char[] arraydePalabraSecreta = palabraSecreta.toCharArray();

		return palabraSecreta;

	}

	static char[] getPalabraGuiones(String palabra) {
		int nLetrasPalabraSecreta = palabra.length();

		char[] palabraConGuiones = new char[nLetrasPalabraSecreta];

		for (int i = 0; i < palabraConGuiones.length; i++) {
			palabraConGuiones[i] = '-';
		}
		return palabraConGuiones;
	}

	static boolean hayGuiones(char[] array) {
		for (char l : array) {
			if (l == '-')
				return true;
		}
		return false;
	}

	public static void main(String[] args) throws IOException {
		String palabraSecreta = getPalabraSecreta();
		char[] palabraGuiones = getPalabraGuiones(palabraSecreta);

		boolean hemosGanado = false;
		int intentos = 5;

		while (!hemosGanado) {
			System.out.println("Te quedan " + intentos + " intentos");
			System.out.println(palabraGuiones);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Adivina la palabra secreta. Escribe una letra: ");
			char letraRecibida = (char) br.read();
			boolean algunaLetraAcertada = false;

			for (int j = 0; j < palabraSecreta.length(); j++) {
				if (palabraSecreta.charAt(j) == letraRecibida) {
					palabraGuiones[j] = letraRecibida;
					algunaLetraAcertada = true;
					boolean juegoGanado = !hayGuiones(palabraGuiones);
					if (juegoGanado)
						System.out.println("Has adivinado la letra!");
				}
			}
			if (!algunaLetraAcertada) {
				System.out.println("No has acertado la letra");
				--intentos;
				if (intentos == 0) {
					System.out.println("Has perdido");
					break;
				}
			} else if (!hayGuiones(palabraGuiones)) {
				System.out.println("Has ganado la partida");
				hemosGanado = true;
			}

		}

	}

}
