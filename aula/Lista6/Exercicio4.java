import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor negociado: ");

        double transação = sc.nextDouble(); 

        double comissão;

        if (transação < 2500){
            comissão = 30 + (transação * 0.017);
        }
        else if ( transação > 2500 && transação < 6250){
            comissão = 56 + (transação * 0.0066);
        }
        else if (transação > 6250 && transação < 20000){
            comissão = 76 + (transação * 0.0034);
        }
        else if (transação > 20000 && transação < 50000){
            comissão = 100 + (transação * 0.0022);
        }
        else if (transação > 50000 && transação < 500000){
            comissão = 155 + (transação * 0.0011);
        }
        else if (transação > 500000){
            comissão = 255 + (transação * 0.0009);
        }

        if (comissão < 39){
            comissão = 39;
        }

        System.out.printf("Taxa de corretagem: %.2f", comissão);

        sc.close();

    }
}