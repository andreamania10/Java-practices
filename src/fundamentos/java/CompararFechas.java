package fundamentos.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class CompararFechas {

	public static void main(String[] args) {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		try {
			Personas p1 = new Personas("dni1", "Juan", formatter.parse("10-11-2024") );
			Personas p2 = new Personas("dni2", "El viejo Juan", formatter.parse("10-11-2015"));
			
			Map personas = new HashMap(); 
			personas.put(p1.getDni(), p1);
			personas.put(p2.getDni(), p2);
			
			Servicios servicio = new Servicios(); 
			try {
				Personas personaViejuna = servicio.getPersonaMayor(personas);
				System.out.println(personaViejuna.getNombre());
			} catch (SinDatosException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				Personas antesAlfabeticamente = servicio.getPrimerNombre(personas);
				System.out.println(antesAlfabeticamente.getNombre());
			} catch (SinDatosException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
}
