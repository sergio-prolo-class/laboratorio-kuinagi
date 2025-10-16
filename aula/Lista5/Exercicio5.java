import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Digite os 12 dígitos do código (Sem o digito verificador): ");
        long codigoLong = sc.nextLong();

        String codigo = String.format("%012d", codigoLong);

        int d1 = codigo.charAt(0) - '0';
        int d2 = codigo.charAt(1) - '0';
        int d3 = codigo.charAt(2) - '0';
        int d4 = codigo.charAt(3) - '0';
        int d5 = codigo.charAt(4) - '0';
        int d6 = codigo.charAt(5) - '0';
        int d7 = codigo.charAt(6) - '0';
        int d8 = codigo.charAt(7) - '0';
        int d9 = codigo.charAt(8) - '0';
        int d10 = codigo.charAt(9) - '0';
        int d11 = codigo.charAt(10) - '0';
        int d12 = codigo.charAt(11) - '0';

        int somaImpares = d1 + d3 + d5 + d7 + d9 + d11;
        int somaPares = d2 + d4 + d6 + d8 + d10 + d12;
        int somaTotal = somaImpares + (somaPares * 3);
        int menosUm = somaTotal - 1;
        int ultimoDigito = menosUm % 10;
        int digitoVerificador = 9 - ultimoDigito;

        System.out.printf("O dígito verificador é: %d %n", digitoVerificador);

        sc.close();
    }
}
    

