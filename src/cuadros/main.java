package cuadros;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double number;
		Scanner leer = new Scanner(System.in);
		cuadro cu = new cuadro();
		
		System.out.println("Introduzca un numero: ");
		number = leer.nextDouble();
		
		double num = (double)Math.round(number * 10d) / 10d;
		cu.separeteDecimal(num);
		System.out.println("Numero redondeado: " + num );
		cu.drawSquares();
	}

}
