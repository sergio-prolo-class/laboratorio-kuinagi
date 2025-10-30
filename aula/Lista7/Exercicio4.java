import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mes = 0, diaInicio = 0, diasMes = 0;
        
        while (mes < 1 || mes > 12 || diaInicio < 1 || diaInicio > 7) {
            System.out.print("Digite o número do mês (1-12): ");
            mes = sc.nextInt();

            System.out.print("Digite o dia da semana que o mês inicia (1=Dom, ..., 7=Sáb): ");
            diaInicio = sc.nextInt();

        if (mes < 1 || mes > 12 || diaInicio < 1 || diaInicio > 7) {
            System.out.println("Valor inválido! Tente novamente.\n");
            }
        }

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                diasMes = 31; break;
            case 4: case 6: case 9: case 11:
                diasMes = 30; break;
            case 2:
                diasMes = 28; break;
        }

        System.out.println("\n D  S  T  Q  Q  S  S");

        for (int i = 1; i < diaInicio; i++) {
            System.out.printf("   ");
        }

        for (int dia = 1; dia <= diasMes; dia++) {
            System.out.printf("%2d ", dia);

            if((dia + diaInicio - 1) % 7 == 0) {
                System.out.println();
            }
        }

        sc.close();
    }
}