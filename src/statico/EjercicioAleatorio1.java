package statico;

public class EjercicioAleatorio1 {

	public static void main(String[] args) {
		String nombre = "Andrea" ;
		int resultado = (int) Math.floor(Math.random() * (nombre.length())) ;
		String letra = nombre.substring(resultado, resultado+1);
		System.out.println(letra);
	}

}
