import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    float vendas, desempenho, salarioTotal;

    System.out.print("Digite o valor total de vendas: ");
    vendas = sc.nextFloat();

    System.out.print("Digite a avaliação de desempenho: ");
    desempenho = sc.nextFloat();

    if (vendas < 10000) {
        salarioTotal = 2000 + vendas * (5.0f/100);
    } 
    else {
        salarioTotal = 2000 + vendas * (7.0f/100);
    }
    if (desempenho >= 8) {
        salarioTotal = salarioTotal + 500;
    }
    System.out.printf("O salarioTotal é %.2f", salarioTotal);

    sc.close();

    }
}
