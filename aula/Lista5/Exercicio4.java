import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um ano: ");
        int ano = sc.nextInt();

        boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

        System.out.printf("O ano %d é bissexto? %b %n", ano, bissexto);

        sc.close();
    }
}
