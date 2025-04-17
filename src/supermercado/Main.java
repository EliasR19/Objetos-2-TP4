package supermercado;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductoPrimeraNecesidad leche =new ProductoPrimeraNecesidad("Leche", 8d, false, 9d);
		System.out.println(leche.calcularPrecio());
	
	}

}
