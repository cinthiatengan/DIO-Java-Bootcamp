package JavaList;

import java.util.List;
import java.util.Vector;

public class exemploVector {
    public static void main(String[] args) {
        List<String> esportes = new Vector<>();

        //adiciona 4 esportes no vetor
        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Golfe");
        esportes.add("Volei");

        //altera o valor da posição 2 do vetor
        esportes.set(2, "Ping Pong");
        System.out.println(esportes);

        // remove o esporte da posição 2
        esportes.remove(2);
        System.out.println(esportes);

        //remove o esporte Golfe do vetor
        esportes.remove("Golfe");
        System.out.println(esportes);

        // retorna o primeiro item do vetor
        System.out.println(esportes.get(0));

        //navega nos esportes
        for (String esporte: esportes){
            System.out.println("-->"+esporte);
        }

    }
}
