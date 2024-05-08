package metodos;

public class Ejercicio16 {
	public String orderMyLogic(int val) {
		  if (val < 5) {
		    return "Menos que 5";
		  } else if (val < 10) {
		    return "Menos que 10";
		  } else {
		    return "Mayor o igual a 10";
		  }
		}
	public static void main(String[] args) {
		Ejercicio16 i = new Ejercicio16(); 
		String resultado = i.orderMyLogic(3);
		System.out.println(resultado);
	}

}
