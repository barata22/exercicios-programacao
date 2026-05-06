import java.util.Scanner;

//Exercicio Problema Negativo

public class Exsegundo
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    
	    System.out.print("Quantos numeros voce vai digitar? ");
	    int n = sc.nextInt();
	    double[] num = new double[n];
	    
	    double soma=0;
	    double media=0;
	    
	    for(int i=0; i<num.length; i++){
	        System.out.print("Digite um numero: ");
	        num[i] = sc.nextDouble();
	        soma += num[i];
	    }
	    
	    System.out.print("VALORES = ");
	    for(int j=0; j<num.length; j++){
	        System.out.print(num[j] + " ");
	    }
	    
	    media = soma / num.length;
	    
	    System.out.printf("%nSOMA = %.2f%n", soma);
	    System.out.printf("MEDIA = %.2f", media);
	    
	    
	    sc.close();
	}
}
