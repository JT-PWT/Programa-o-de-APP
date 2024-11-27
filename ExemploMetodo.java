import java.util.Collection;
import java.util.ArrayList;

public class ExemploMetodo {
    public static void main(String[] args) {
        // Criação de uma coleção de Strings
        Collection<String> nomes = new ArrayList<>(); // Adicionando o tipo genérico
        nomes.add("Germano");
        nomes.add("Paulo");
        nomes.add("Daiana");
        nomes.add("Jeferson");
        nomes.add("Igor");

        // Imprimindo a lista de nomes
        System.out.println("Lista de nomes: " + nomes + ".");
    }
}