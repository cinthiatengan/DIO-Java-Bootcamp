package JavaList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExerciciosList {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Rafael");
        nomes.add("Emily");
        nomes.add("Cinthia");
        nomes.add("Tico");
        nomes.add("Lidia");

        System.out.println(nomes);

        for (String nomePessoa: nomes){
            System.out.println("--->"+ nomePessoa);
        }

        nomes.set(4, "Bolt");
        System.out.println(nomes);

        System.out.println(nomes.get(1));

        nomes.remove(4);
        System.out.println(nomes);

        nomes.remove("Tico");
        System.out.println(nomes);

        System.out.println(nomes.size());

        System.out.println(nomes.contains("Jerico"));

        // nova lista

        //nomes.clear();

        //nomes.add("Roniscleison");
        //nomes.add("Garibaldo");
       // nomes.add("VinDieselFake");
       // nomes.add("Robersval");

        Collections.sort(nomes);
        System.out.println(nomes.isEmpty());
    }
}
