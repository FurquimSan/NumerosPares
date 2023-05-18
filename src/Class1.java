import java.util.Scanner;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner LeitorNumero = new Scanner (System.in);
    int Num;
    int Quantidade = 0;
    	System.out.println("Digite um numero");
    	Num = LeitorNumero.nextInt();
    	while (Num % 2 == 0) {
    		System.out.println("Digite um numero");
    		Num = LeitorNumero.nextInt();
    		Quantidade++;
    	}
    	System.out.println("Voce digitou " + Quantidade + " Numeros pares" );
    }
}  