import java.util.Scanner;

public class Exercício3 {
    public static void main(String[] args) {
        
        

        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Qual o tempo gasto: ");
        double tempo = scanner.nextDouble();

        
        System.out.print("Qual a velocidade média: ");
        double velocidade = scanner.nextDouble();

        
        double distancia = (tempo * velocidade)/60;

        double consumo = 12;

        double litros = distancia/consumo;

        System.out.println("A velocidade média é: " + velocidade);
        System.out.println("O tempo gasto é: " + tempo);
        System.out.println("A distância percorrida é: " + distancia + "Km.");
        System.out.println("A quantidade de litros consumidos: " + litros);

       

        scanner.close();

    }
    
}
