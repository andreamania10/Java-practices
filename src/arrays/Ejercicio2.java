package arrays;

public class Ejercicio2 {

	public static void main(String[] args) {
		int [] myList = {1,9,3,8,5,7};
		
		for(int i=0; i<myList.length; i++) {
			int myListDuplicada = myList[i] * 2;
			System.out.println(myListDuplicada);
		}
	}

}
