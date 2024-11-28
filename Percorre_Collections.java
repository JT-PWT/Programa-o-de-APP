import java.util.ArrayList;
import java.util.Collection;;

public class Percorre_Collections {
    
    public static void main(String[] args) {
        Collection<String> vogais = new ArrayList<>();
        vogais.add("A");
        vogais.add("E");
        vogais.add("I");
        vogais.add("O");
        vogais.add("U");

        //Percorre todos os elementos da coleção vogais
        for(String vog : vogais){
            System.out.println("Vogal: " + vog);
        }
    }   
}
