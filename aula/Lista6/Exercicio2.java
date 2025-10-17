import java.util.Scanner;

public class Exercicio2{
    public static void main(String[] args){
    Scanner sc = new Scanner (System.in);

    int lado1, lado2, lado3;

    System.out.print("Digite os valores dos lados do triângulo: ");
    lado1 = sc.nextInt();
    lado2 = sc.nextInt();
    lado3 = sc.nextInt();

    if(lado1 + lado2 < lado3 || lado1 + lado3 < lado2 || lado2 + lado3 < lado1){
        System.out.print("Triângulo inválido.");
    }
    else if (lado1 == lado2 && lado1 == lado3){
        System.out.print("Triângulo equilátero.");
    }
    else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
        System.out.print("Triângulo isósceles.");
    }
    else{
        System.out.print("Triângulo escaleno.");
    }

    sc.close();

    }
}
