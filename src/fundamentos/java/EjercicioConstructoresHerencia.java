package fundamentos.java;

public class EjercicioConstructoresHerencia {

	public static void main(String[] args) {
        Animal vaca = new Vaca();
        vaca.comunicarse();

        Animal cerdo = new Cerdo();
        cerdo.comunicarse();

        Animal gallina = new Gallina();
        gallina.comunicarse();
	}
}
	class Animal {
		public Animal(){
		}

		void comunicarse() {
			String sonido = "Sonido genérico"; 
			System.out.println(sonido);
		}
	}
	
	class Vaca extends Animal {
		public Vaca() {
			super(); 
			
		}
		@Override
			void comunicarse() {
				String sonido = "muuuuuu";
				System.out.println("Cuando la vaca tiene leche hace " + sonido);
			}
	}
	class Cerdo extends Animal {
		public Cerdo () {
		super();  	
	}
		@Override
		void comunicarse() {
			String sonido = "oinkoink";
			System.out.println("Cuando el cerdo gruñe, hace " + sonido);
		}
	}
	
	class Gallina extends Animal {
		public Gallina () {
		super(); 
	}
		@Override
		void comunicarse() {
			
			String sonido = "kokoroko";
		System.out.println("Cuando la gallina pone huevos hace " + sonido);		
		
		}
	}

