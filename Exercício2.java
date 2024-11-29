import java.util.Scanner;

public class Exercício2 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Identificador do vendedor: ");
        String vendedor = scanner.nextLine();

        
        System.out.print("Código da peça: ");
        int peça = scanner.nextInt();

    
        System.out.print("Preço unitário da peça: ");
        double preço = scanner.nextDouble();

        
        System.out.print("Quantidade vendida: ");
        double quantidade = scanner.nextDouble();

        double soma = preço * quantidade;

        double comissao = (soma*5)/100;

       
        System.out.println("Identificação do(a) vendedor(a): " + vendedor);
        System.out.println("Código da peça: " + peça);
        System.out.println("Total da venda: " + soma);
        System.out.println("Comissão do vendedor:" + comissao);

        
        scanner.close();
    }
}