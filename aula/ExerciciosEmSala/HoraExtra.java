import java.util.Scanner;

public class HoraExtra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double horas, pagamento = sc.nextDouble();
        
        System.out.println("Digite as horas trabalhadas: ");
        horas = sc.nextDouble();
        pagamento = 50.0 * horas;
        if (horas > 8) {
            pagamento += 25 * (horas - 8.0);
        }
        System.out.printf("Pagamento: R$ %.2f%n", pagamento);
        sc.close();
    }   
}
