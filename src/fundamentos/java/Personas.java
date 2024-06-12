package fundamentos.java;

import java.util.Date;

public class Personas implements Comparable<Personas> {
private String dni; 
private String nombre; 
private Date fechaNacimiento;

public Personas(String dni, String nombre, Date fechaNacimiento) {
	super();
	this.dni = dni; 
	this.nombre = nombre; 
	this.fechaNacimiento = fechaNacimiento; 
}

@Override
public boolean equals(Object obj) {
	if(!(obj instanceof Personas)) return false; 
	Personas persona = (Personas) obj;
	return (dni).equals(persona.dni);
}

@Override
public int compareTo (Personas obj) {
	Personas persona = (Personas) obj; 
	Date otherPerson = persona.getFechaNacimiento();
	
	if(otherPerson.equals(fechaNacimiento) ) {
		return 0; 
	} else if (otherPerson.after(fechaNacimiento)) {
		return 1; 
	} else {
		return -1;
	}
}

public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Date getFechaNacimiento() {
	return fechaNacimiento;
}
public void setFechaNacimiento(Date fechaNacimiento) {
	this.fechaNacimiento = fechaNacimiento;
} 


}
