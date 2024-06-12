package fundamentos.java;

public  class Deposito implements Comparable<Deposito> {
private String nombre; 
private int largo; 
private int ancho; 
private int alto; 

public Deposito (String nombre, int largo, int ancho, int alto) {
	super();
	this.nombre = nombre;
	this.largo = largo; 
	this.ancho = ancho; 
	this.alto = alto; 
}

@Override
public boolean equals(Object obj) {
	if(!(obj instanceof Deposito)) return false; 
	
	Deposito deposito = (Deposito) obj; 
	return (largo * ancho * alto == deposito.largo*deposito.ancho*deposito.alto);
}


@Override
public int compareTo (Deposito obj) {
	Deposito deposito = (Deposito) obj; 
	int producto1 = largo * ancho * alto; 
	int producto2 = deposito.getAlto() * deposito.getAncho() * deposito.getLargo();
	
	if(producto1 > producto2) {
		return 1; 
	} else if (producto2 > producto1) {
		return -1; 
	}else {
		return 0; 
	}
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getLargo() {
	return largo;
}

public void setLargo(int largo) {
	this.largo = largo;
}

public int getAncho() {
	return ancho;
}

public void setAncho(int ancho) {
	this.ancho = ancho;
}

public int getAlto() {
	return alto;
}

public void setAlto(int alto) {
	this.alto = alto;
}
}