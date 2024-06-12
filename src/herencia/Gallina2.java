package herencia;

public class Gallina2 {

	public static void main(String[] args) {

		Animal2 gallina = new Gallina(); 
		gallina.comunicarse();
	}
}
	
class Gallina extends Animal2 { 
	public Gallina () {
			super(); 
		}
		
		@Override
		void comunicarse() {
			String sonido = "kokokoroko"; 
			System.out.println("La gallina hace " + sonido);
		}
	}

