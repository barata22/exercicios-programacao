package salarioFuncionario.src;

import java.util.Locale;
import java.util.Scanner;

import salarioFuncionario.entities.funcionario;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many employess will be registered?");
        int x = sc.nextInt();
        funcionario[] funcionario = new funcionario[x];

        for (int i = 0; i < x; i++){
            System.out.println("Employee #" + i + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            funcionario[i] = new funcionario(id, salary, name);
        }


        sc.close();
    }
}
