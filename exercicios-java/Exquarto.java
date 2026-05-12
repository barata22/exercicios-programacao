import java.util.Scanner;

public class Exquarto{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar: ");
        int quantidade = sc.nextInt();

        int[] numPares = new int[quantidade];
        int quantPares=0;

        for(int i=0; i < numPares.length; i++){
            System.out.print("Digite um numero: ");
            numPares[i] = sc.nextInt();
            if(numPares[i] % 2 == 0){quantPares++;};
        }

        System.out.println("NUMEROS PARES:");

        for(int j=0; j < numPares.length; j++){
            if(numPares[j] % 2 ==0){
                System.out.print(numPares[j] + " ");
            }
        }

        System.out.printf("%nQuantidade de pares: %d", quantPares);

        sc.close();
    }
}