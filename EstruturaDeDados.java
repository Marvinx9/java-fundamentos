import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Afranio");
        nomes.add("Maria");
        nomes.add("Pedro");

        // System.out.println(nomes.get(0));

        // for (String nome : nomes) {
        //     System.err.println("O nome e: " + nome);
        // }

        nomes.forEach(nome -> System.out.println("O nome que pareceu foi: " + nome));
    }    
}
