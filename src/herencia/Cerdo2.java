package herencia;

public class Cerdo2 {
	
	public static void main(String[] args) {
		Animal2 cerdo = new Cerdo(); 
		cerdo.comunicarse();
	}
	
	
}

class Cerdo extends Animal2 {
	public Cerdo() {
		super(); 
	}
	
	@Override
	void comunicarse() {
		String sonido = "oinkoink"; 
		System.out.println("El cerdo cuando tiene hambre hace " + sonido);		
	}
}