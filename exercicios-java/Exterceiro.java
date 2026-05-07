import java.util.Scanner;

//Exercicio Problema alturas

public class Exterceiro
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Quantas pessoas serao digitadas? ");
	    int quantidade = sc.nextInt();
	    
	    
	    String[] nome = new String[quantidade];
	    int[] idade = new int[quantidade];
	    double[] altura = new double[quantidade];
	    double sum=0;
	    int menorIdade = 0;
	    
	    for(int i=0; i<nome.length; i++){
	        System.out.println("Dados da " + (i+1) + "a pessoa:");
	        System.out.print("Nome: ");
	        nome[i] = sc.next();
	        System.out.print("Idade: ");
	        idade[i] = sc.nextInt();
	        System.out.print("Altura: ");
	        altura[i] = sc.nextDouble();
	        sum += altura[i];
	        }
	        double alturaMedia = sum / altura.length;
	        double porcentagem = menorIdade / quantidade * 100;
	    int a =0;
	        
	        sc.close();
	    }
	}
