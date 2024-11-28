import java.util.HashMap;

public class ExemploMap {
    public static void main(String[] args) {
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("Maçã",10);
        mapa.put("Banana",20);
        mapa.put("Laranja",30);

        System.out.println(mapa.get("Banana")); // Acesso por chave
    }
}
