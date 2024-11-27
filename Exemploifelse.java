
import java.util.Scanner;

public class ExemploIfElse {
	public static void main (String[] args){
        Scanner scanner = new Scanner(System.in); //cria um objeto scanner para leitura de entrada do usuário

        System.out.print("Digite quantos anos de experiência você possui? "); //solicita a entrada do usuário
	   int anosDeExperiencia = scanner.nextInt();
       if(anosDeExperiencia <2) {
	   		System.out.println("Vc é um desenvovedor júnor! " );
	   } else if ( anosDeExperiencia >= 2 && anosDeExperiencia < 5){
            System.out.println("Vc é um desenvovedor pleno! " );
       } else {
        System.out.println("Vc é um desenvovedor sênior! " );
       }
       scanner.close(); // fecha scanner
	}
}
