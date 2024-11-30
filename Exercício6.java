import java.util.Scanner;

public class Exercício4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Qual a primeira nota: ");
        double primeira = scanner.nextDouble();

        System.out.print("Qual a segunda nota: ");
        double segunda = scanner.nextDouble();

        System.out.print("Qual a terceira nota: ");
        double terceira = scanner.nextDouble();

        System.out.print("Qual a quarta nota: ");
        double quarta = scanner.nextDouble();


        
        double mediaNota = (primeira + segunda + terceira + quarta)/4;

        if (mediaNota >= 7 ) {
            System.out.println("Aluno aprovado!!!");
        } else {
            System.out.println("Aluno reprovado!!!");
        }
        

        scanner.close();

    }
    
}
