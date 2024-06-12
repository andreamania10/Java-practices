package fundamentos.java;

public class SinDatosException extends Exception {
@Override
public void printStackTrace() {
System.out.println("No hay datos");}
}
