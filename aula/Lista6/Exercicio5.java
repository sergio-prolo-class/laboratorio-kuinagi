
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número entre 1 e 99: ");
        int numero = sc.nextInt();

        int dezena = numero / 10;
        int unidade = numero % 10;
        String extenso = "";

        if (numero < 20) {
            switch (numero) {
                case 1:  extenso = "um"; break;
                case 2:  extenso = "dois"; break;
                case 3:  extenso = "três"; break;
                case 4:  extenso = "quatro"; break;
                case 5:  extenso = "cinco"; break;
                case 6:  extenso = "seis"; break;
                case 7:  extenso = "sete"; break;
                case 8:  extenso = "oito"; break;
                case 9:  extenso = "nove"; break;
                case 10: extenso = "dez"; break;
                case 11: extenso = "onze"; break;
                case 12: extenso = "doze"; break;
                case 13: extenso = "treze"; break;
                case 14: extenso = "catorze"; break;
                case 15: extenso = "quinze"; break;
                case 16: extenso = "dezesseis"; break;
                case 17: extenso = "dezessete"; break;
                case 18: extenso = "dezoito"; break;
                case 19: extenso = "dezenove"; break;
            }
        } else {
            switch (dezena) {
                case 2: extenso = "vinte"; break;
                case 3: extenso = "trinta"; break;
                case 4: extenso = "quarenta"; break;
                case 5: extenso = "cinquenta"; break;
                case 6: extenso = "sessenta"; break;
                case 7: extenso = "setenta"; break;
                case 8: extenso = "oitenta"; break;
                case 9: extenso = "noventa"; break;
            }

            if (unidade != 0) {
                extenso += " e ";
                switch (unidade) {
                    case 1: extenso += "um"; break;
                    case 2: extenso += "dois"; break;
                    case 3: extenso += "três"; break;
                    case 4: extenso += "quatro"; break;
                    case 5: extenso += "cinco"; break;
                    case 6: extenso += "seis"; break;
                    case 7: extenso += "sete"; break;
                    case 8: extenso += "oito"; break;
                    case 9: extenso += "nove"; break;
                }
            }
        }

        System.out.printf("Número por extenso: %s%n", extenso);

        sc.close();
    }
}
