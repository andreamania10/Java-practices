package herencia;

public class Vaca2 {

	public static void main(String[] args) {
		Animal2 vaca = new Vaca(); 
		vaca.comunicarse();
	}
}

class Vaca extends Animal2 {
	public Vaca() {
		super(); 
	}
	
	@Override
	void comunicarse() {
		String sonido = "muuuuu"; 
		System.out.println("La vaca cuando le sacan leche hace " + sonido);
	}
}
