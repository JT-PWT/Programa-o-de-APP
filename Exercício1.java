import java.util.Scanner;


public class Exercício1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Quantidade mínima é: ");
        double quantidade_minima = scanner.nextDouble();

        
        System.out.print("Quantidade máxima é: ");
        double quantidade_maxima = scanner.nextDouble();

        
        double estoqueMedio = (quantidade_minima + quantidade_maxima)/2;

        System.out.println("A média do estoque é: " + estoqueMedio);

        scanner.close();
    }
}