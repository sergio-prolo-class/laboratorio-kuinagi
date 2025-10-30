import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        final int arqueiro = 1;
        final int barbaro = 2;
        final int druida = 3;
        final int mago = 4;

        System.out.print("Digite a classe: (1 - Arqueiro, 2 - Bárbaro, 3 - Druída, 4 - Mago)");
        int classe = sc.nextInt();

        System.out.print("Digite a vitalidade desejada: ");
        int vitalidadeDesejada = sc.nextInt();

        int vitalidade = 0;
        int incremento = 0;
        int nivel = 0;

        switch (classe) {
            case arqueiro:
                vitalidade = 150;
                incremento = 10;
            break;
            case barbaro:
                vitalidade = 200;
                incremento = 15;
            break;
            case druida:
                vitalidade = 100;
                incremento = 5;
            break;
            case mago:
                vitalidade = 80;
                incremento = 4;
            break;
            default:
                System.out.println("Classe inválida.");
                sc.close();
                return;
        }

        while (vitalidade < vitalidadeDesejada){
            nivel++;

        //bonus
        if (nivel % 5 == 0) {
            vitalidade += incremento * 2;
        } 
        else {
            vitalidade += incremento;
        }
        }
        
        System.out.printf("Nível mínimo necessário: %d%n", nivel);
        sc.close();
    }
}