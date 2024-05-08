package booleanos;

public class Rectángulo {
	double PI = 3.1416; //Math.PI
	void calculaPerimetro (int radio) {
		int perimetro = (int) (2 * PI * radio); 
		System.out.println(perimetro);
	}
	
	void calculaArea(int radio) {
		int area = (int) (PI * radio * radio);
		System.out.println(area);

	}
	public static void main(String[] args) {
		Rectángulo i = new Rectángulo(); 
		i.calculaPerimetro(5);
		i.calculaArea(3);
	}

}
