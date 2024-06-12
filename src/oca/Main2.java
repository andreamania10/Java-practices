package oca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main2 {
	static ArrayList<Jugadores> jugadores = new ArrayList<>();
	static HashMap<Integer, Integer> casillasOca = new HashMap<>();

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Inserte el número de jugadores: ");
		int numeroPlayers = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < numeroPlayers; i++) {
			System.out.println("Introduzca el nombre de los jugadores");
			String nombre = br.readLine();
			Jugadores j = new Jugadores(nombre);
			jugadores.add(j);
		}
		
		jugadores.forEach(jugador -> System.out.println(jugador.getNombre()));

		jugar();
	}

	static void jugar() {
		boolean hemosTerminado = false;
		casillasOca.put(5, 9);
		casillasOca.put(9, 14);
		casillasOca.put(14, 18);
		casillasOca.put(18, 23);
		casillasOca.put(23, 27);
		casillasOca.put(27, 32);
		casillasOca.put(32, 36);
		casillasOca.put(36, 41);
		casillasOca.put(41, 45);
		casillasOca.put(45, 50);
		casillasOca.put(50, 54);
		casillasOca.put(54, 59);

		while (!hemosTerminado) {
			int i = 0;
			while (i < jugadores.size()) {
				Jugadores jugadorActual = jugadores.get(i);

				if (jugadorActual.getTurnosRestantes() == 0) {
					int dado = (int) Math.floor(Math.random() * (6) + 1);
					System.out.println("Lanzando los dados... ");
					System.out.println("El resultado del dado es: " + dado);
					int nuevaPosition = jugadorActual.getPosition() + dado;
					System.out.println("La nueva posición es: " + nuevaPosition);

					Integer destinoOca = casillasOca.get(nuevaPosition);
					if (destinoOca != null) {
						System.out.println(jugadorActual.getNombre()+" De oca a oca y tiro porque me toca");
						jugadorActual.setPosition(destinoOca);
					} else {
						if (nuevaPosition == 3 || nuevaPosition == 19) {
							System.out.println(jugadorActual.getNombre()+" Has caído, pierdes dos turnos");
							jugadorActual.setTurnosRestantes(2);
							i++;
						} else if (nuevaPosition == 6) {
							System.out.println(jugadorActual.getNombre()+" De puente a puente y tiro por la corriente");
							jugadorActual.setPosition(12);
							
						} else if (nuevaPosition == 12) {
							System.out.println(jugadorActual.getNombre()+ " De puente a puente y tiro por la corriente");
							jugadorActual.setPosition(6);
							
						} else if (nuevaPosition == 26) {
							System.out.println(jugadorActual.getNombre()+ " De dado a dado, y reboto");
							jugadorActual.setPosition(53);
							
						} else if (nuevaPosition == 53) {
							System.out.println(jugadorActual.getNombre()+ " De dado a dado, y reboto");
							jugadorActual.setPosition(26);
							
						} else if (nuevaPosition == 52) {
							System.out.println(jugadorActual.getNombre()+ " Has caído en la cárcel, pierdes tres turnos");
							jugadorActual.setTurnosRestantes(3);
							i++;
						} else if (nuevaPosition == 58) {
							System.out.println(jugadorActual.getNombre()+  " Has caído en la muerte, vuelves al inicio");
							jugadorActual.setPosition(1);
							i++;
						}else {
							jugadorActual.setPosition(nuevaPosition);
							i++;
						}
					}

					if (jugadorActual.getPosition() >= 63) {
						System.out.println("Has ganado");
						hemosTerminado = true;
					}
				}else {
					jugadorActual.setTurnosRestantes(jugadorActual.getTurnosRestantes()-1);
					
				}
			}
		}
	}
}
