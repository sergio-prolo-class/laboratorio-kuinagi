import java.util.Scanner;   
        
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Temperatura em Fahrenheint: ");
        double fahrenheint = sc.nextDouble();
        double celsius = (fahrenheint - 32) * (5/9.0);

        System.out.printf("A temperatura em Celsius é: %f %n", celsius);

        sc.close();
        } 
    }          