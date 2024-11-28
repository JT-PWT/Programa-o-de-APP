import java.util.Arrays;
import java.util.List;

public class ExemploForEach {
    public static void main(String[] args) {
        // Criação da lista de frutas
        List<String> frutas = Arrays.asList("Maça","Banana","Laranja");

        // Uso do forEach para imprimir cada fruta
        frutas.forEach(fruta -> System.out.println(fruta));
    }
}
