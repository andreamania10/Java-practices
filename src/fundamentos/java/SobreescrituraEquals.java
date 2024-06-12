package fundamentos.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SobreescrituraEquals {

	public static void main(String[] args) {
		Deposito d1 = new Deposito("deposito1", 3, 2, 1); 
		Deposito d2 = new Deposito("deposito2", 4, 2, 1); 
		Deposito d3 = new Deposito("deposito3", 7, 8, 9); 
		Deposito d4 = new Deposito("deposito4", 1, 4, 7); 
		Deposito d5 = new Deposito("deposito5", 2, 5, 8);
		
		List<Deposito> depositos = new ArrayList<>();
		depositos.add(d5); 
		depositos.add(d3); 
		depositos.add(d2); 
		depositos.add(d4); 
		depositos.add(d1); 
		
		Collections.sort(depositos);
		Iterator<Deposito> it = depositos.iterator(); 
		while(it.hasNext()) {
			Deposito d= it.next(); 
			
			System.out.println(d.getNombre());
		}
	}

}
