package fundamentos.java;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Servicios {

public Personas getPersonaMayor(Map personas) throws SinDatosException{
	
	if(personas.size() == 0) {
		throw new SinDatosException();
	}else {

Personas personaDevuelta = null;
Collection<Personas> collection = personas.values(); 
Iterator<Personas> it = collection.iterator(); 
while(it.hasNext()) {
	if(personaDevuelta==null) {
		personaDevuelta = it.next();
		
	} else {
		Personas p = it.next();
		if (personaDevuelta.getFechaNacimiento().getTime() < p.getFechaNacimiento().getTime()) {
			personaDevuelta = p; 
	}
		
	}
}
return personaDevuelta;
	}
}


public Personas getPrimerNombre(Map personas) throws SinDatosException  {
	
	if(personas.size() == 0) {
		throw new SinDatosException();
	}else {
	Personas personaDevuelta = null;
	Collection<Personas> collection = personas.values(); 
	Iterator<Personas> it = collection.iterator(); 
	while(it.hasNext()) {
		if(personaDevuelta==null) {
			personaDevuelta = it.next();
			
		} else {
			Personas p = it.next();
			if (personaDevuelta.getNombre().compareTo(p.getNombre()) == -1) {
				personaDevuelta = p; 
		}
			
		}
	}
	return personaDevuelta;
		}

}
}
