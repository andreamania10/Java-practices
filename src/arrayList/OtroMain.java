package arrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class OtroMain {

	static ArrayList<Alumno> alumnos = new ArrayList<>();

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean hemosTerminado = false;

		while (!hemosTerminado) {
			System.out.println("Qué operación queremos realizar? Insertar nuevo alumno?" + " Eliminar un alumno? "
					+ " Modificar los datos de un alumno? " + " O mostrar todos los alumnos almacenados? ");
			String respuestaOpcion = br.readLine().toLowerCase();

			if (respuestaOpcion.equals("insertar")) {
				Insertar();
			} else if (respuestaOpcion.equals("eliminar")) {
				Eliminar();
			} else if (respuestaOpcion.equals("modificar")) {
				Modificar();
			} else if (respuestaOpcion.equals("mostrar")) {
				Mostrar();
			} else {
				hemosTerminado = true; 
			}
		}
	}

	static void Insertar() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Inserta el nombre del alumno");
		String nombre = br.readLine();
		System.out.println("Ahora la edad del alumno ");
		int edad = Integer.parseInt(br.readLine());
		Alumno m = new Alumno(nombre, edad);
		alumnos.add(m);

		alumnos.forEach(alumno -> System.out.println(alumno.getNombre()));
		alumnos.forEach(alumno -> System.out.println(alumno.getEdad()));

	}

	static void Eliminar() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Inserta el nombre del alumno que deseas eliminar");
		String nombreBorrar = br.readLine();

		for (int i = 0; i < alumnos.size(); i++) {
			if (alumnos.get(i).getNombre().equals(nombreBorrar)) {
				alumnos.remove(i);
				System.out.println("Se ha eliminado el nombre " + nombreBorrar);

				alumnos.forEach(alumno -> System.out.println(alumno.getNombre()));
				alumnos.forEach(alumno -> System.out.println(alumno.getEdad()));
			}
		}
	}

	static void Modificar() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Inserta el nombre del alumno que deseas modificar");
		String nombre = br.readLine(); 
		
		System.out.println("Por cuál nombre deseas modificarlo? ");
		String nombreModificado = br.readLine();
		
		System.out.println("Inserta la edad del alumno que deseas modificar");
		int edad = Integer .parseInt(br.readLine()) ; 
		
		System.out.println("Qué edad deseas modificar? ");
		int edadModificada = Integer .parseInt(br.readLine());
		
		for(int i=0; i <alumnos.size(); i++) {
			if(alumnos.get(i).getNombre().equals(nombre)) {
				Alumno al =alumnos.get(i);
				al.setNombre(nombreModificado);
				al.setEdad(edadModificada);
			} 
		}	
	}

	static void Mostrar() {
		alumnos.forEach(alumno -> System.out.println(alumno.getNombre()));
		alumnos.forEach(alumno -> System.out.println(alumno.getEdad()));
	}

}