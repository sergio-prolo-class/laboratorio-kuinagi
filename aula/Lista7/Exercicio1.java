import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linhas;
        
        do{
          System.out.print("Insira quantas linhas terá o Triângulo de Floyd: ");
            linhas = sc.nextInt();
        } while (linhas < 0);

        for (int i = 1; i <= linhas; i++){
            for (int j =i; j < (i*2); j++){
                System.out.printf(" %d ", num);
                num += 1;
            }
            System.out.println(" ");
        }

        sc.close();
        
    }
}
