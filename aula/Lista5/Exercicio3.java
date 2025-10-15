import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        
        int valor, moedas; 
        System.out.print("Digite o valor em centavos: ");
        Scanner sc = new Scanner(System.in);

        valor = sc.nextInt();

        moedas = valor / 50;
        System.out.printf("Serao necessarias %d%n", moedas, "de 50 centavos.");
        valor = valor % 50;

        moedas = valor / 25;
        System.out.printf("Serao necessarias %d%n", moedas, "de 25 centavos.");
        valor = valor % 25;

        moedas = valor / 10;
        System.out.printf("Serao necessarias %d%n", moedas, "de 10 centavos.");
        valor = valor % 10;

        moedas = valor / 5;
        System.out.printf("Serao necessarias %d%n", moedas, "de 5 centavos.");
        valor = valor % 5;

        moedas = valor / 1;
        System.out.printf("Serao necessarias %d%n", moedas, "de 1 centavo.");

        sc.close();
    }
}
