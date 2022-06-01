package ejemplo;


public class UsoCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculadora calc = new Calculadora(2,3);
		int sum = calc.suma();
		System.out.println(sum);
		
		int mult = calc.multiplica();
		System.out.println(mult);
	}

}

