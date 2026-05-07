import java.util.Locale;
import java.util.Scanner;

//Exercicio Problema alturas

public class Exterceiro
{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Quantas pessoas serao digitadas? ");
	    int quantidade = sc.nextInt();
	    
	    
	    String[] nome = new String[quantidade];
	    int[] idade = new int[quantidade];
	    double[] altura = new double[quantidade];
	    double sum=0;
	    double menorIdade = 0;
	    
	    for(int i=0; i<nome.length; i++){
	        System.out.println("Dados da " + (i+1) + "a pessoa:");
	        System.out.print("Nome: ");
	        nome[i] = sc.next();
	        System.out.print("Idade: ");
	        idade[i] = sc.nextInt();
	        System.out.print("Altura: ");
	        altura[i] = sc.nextDouble();
	        sum += altura[i];
			if(idade[i] < 16){menorIdade++;}
	        }
	        double alturaMedia = sum / altura.length;
	        double porcentagem = menorIdade / quantidade * 100.0;

			System.out.printf("Altura média: %.2f%n", alturaMedia);
			System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagem);

			for(int j=0; j<idade.length; j++){
				if(idade[j] < 16){
					System.out.printf("%s\n", nome[j]);
				}
			}
	        
	        sc.close();
	    }
	}
