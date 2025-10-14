import java.util.Scanner;

    public class IMC {
        public static void main(String[] args) {

        double peso, altura, IMC; 
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o peso: ");
        peso = sc.nextDouble();

        System.out.print("Insira a altura: ");
        altura = sc.nextDouble();

        IMC = peso / (altura * altura);
        
        if (IMC < 18.50) {
            System.out.println("Risco de comorbidades: Baixo");
        } else if(IMC < 24.99) {
            System.out.println("Risco de comorbidades: Médio");
        }
        else if (IMC < 29.99) {
            System.out.println("Risco de comorbidades: Pouco elevado");
        }
        else if (IMC < 34.99) {
            System.out.println("Risco de comorbidades: Elevado");
        }
        else if (IMC > 39.99) {
            System.out.println("Risco de comorbidades: Muito elevado");
        }
        else if (IMC >= 40.0) {
            System.out.println("Risco de comorbidades: Muitissimo elevado");
        }
        sc.close(); 
    }
}
