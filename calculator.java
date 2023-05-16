import java.util.Scanner;

public class calculator {
    public static void main (String[] args){

    Scanner scan = new Scanner (System.in);
    int nmr1;
	int nmr2;
	
	System.out.println("digite o primeiro numero para o calculo");
	nmr1 = scan.nextInt();

    System.out.println("digite o segundo numero");
    nmr2 = scan.nextInt();

    System.out.println("Aqui esta o resultado:" + " " + nmr1 * nmr2);

   

    }
}