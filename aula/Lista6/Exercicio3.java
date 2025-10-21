import java.util.Scanner;

public class Exercicio3 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Insira o valor de um ângulo (entre 0° e 360°): ");
        double angulo = sc.nextDouble();

        double rad = Math.toRadians(angulo);

        double senoReal = Math.sin(rad);

        boolean houveCorrecao = false;

        if (angulo > 180){
            angulo = 360 - angulo;
            houveCorrecao = true;
        }
        
        double senoBhaskara = (4 * angulo * (180 - angulo)) / (40500 - angulo * (180 - angulo));

        if (houveCorrecao) {
            senoBhaskara *= -1;
        } 
        
        System.out.printf("Ângulo: %.2f%n", angulo);
        System.out.printf("Seno feito com Bhaskara: %.4f%n", senoBhaskara);
        System.out.printf("Seno real (Feito com o Math.sin): %.4f%n", senoReal);

        sc.close();
    }
}
