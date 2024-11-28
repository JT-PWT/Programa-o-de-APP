import java.util.Collection;
import java.util.ArrayList;


public class Metodo_Empty {
    public static void main(String[] args) {
        Collection<String> letras = new ArrayList<>();
        letras.add("A");
        letras.add("B");
        letras.add("C");
        letras.add("D");
        letras.add("E");
        letras.add("F");

        if(letras.isEmpty()){
            System.out.println("Lista vazia");
        } else {
            System.out.println("Contém Valores -> " + letras);
        }
    }   
}
