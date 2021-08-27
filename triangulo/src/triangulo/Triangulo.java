package triangulo;

import java.util.Scanner;

public class Triangulo {public static void main(String[] args) {
	Scanner leitor = new Scanner (System.in);
	
	int l1, l2, l3;
	
	System.out.println("qual a medida do primeiro lado do triângulo");
	l1 = leitor.nextInt();
	System.out.println("qual a medida do segundo lado do triângulo");
	l2 = leitor.nextInt();
	System.out.println("qual a medida do terceiro lado do triângulo");
	l3 = leitor.nextInt();
	
	leitor.close();
	
	if ((l1 < l2 + l3) && (l2 < l1 + l3) && (l3 < l1 + l2)) {
		if (l1 == l2 && l1 == l3) {
			System.out.println("Triângulo Equilatero");
		}else if ((l1 == l2) || (l1 == l3)) {
			System.out.println("Triângulo Isosceles");
		}else {
			System.out.println("Triângulo escaleno");
		}
	}else {
		System.out.println("Não é um triângulo");
	}
	
	
}

}
