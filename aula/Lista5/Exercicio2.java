import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira as notas: ");
        double soma = sc.nextDouble();
        soma += sc.nextDouble();
        soma += sc.nextDouble();
        soma += sc.nextDouble();

        System.out.printf("Insira a frequencia: ");
        int frequencia = sc.nextInt();
        
        System.out.printf("A media é: %.2f %s %n", soma/4, (frequencia > 75) && (soma >= 6) ? "Aprovado" : "Reprovado");


        sc.close();
    }
}