package oca;

public class Jugadores {
private String nombre; 
private int turnosRestantes; 
private boolean activo;
private int position; 

public Jugadores(String nombre) {
	this.nombre=nombre;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
	
}

public int getPosition() {
	return position;
}

public void setPosition(int position) {
	this.position = position;
} 

public int getTurnosRestantes() {
	return turnosRestantes;
}

public void setTurnosRestantes(int turnosRestantes) {
	this.turnosRestantes = turnosRestantes;
}


}


