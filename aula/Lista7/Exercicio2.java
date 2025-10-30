import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int senhaCorreta = 314159;
        final int maxTentativas = 3;

        int tentativas = 0;
        int senhaDigitada;

        while (tentativas < maxTentativas) {
            System.out.print("Digite a senha: ");
            senhaDigitada = sc.nextInt();

            if (senhaDigitada == senhaCorreta) {
                System.out.println("Acesso autorizado.");
                sc.close();
                return;
            } 
            else {
                System.out.println("Acesso negado.");
                tentativas++;
            }
        }
        System.out.println("Acesso bloqueado");
        sc.close();

    }
}