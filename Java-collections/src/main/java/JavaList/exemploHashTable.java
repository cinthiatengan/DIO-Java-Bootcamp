package JavaList;

import java.util.Hashtable;

public class exemploHashTable {
    public static void main(String[] args) {
        Hashtable<String, Integer> estudantes = new Hashtable<>();

        estudantes.put("Carlos", 21);
        estudantes.put("Mariana", 33);
        estudantes.put("Rafaela", 18);
        estudantes.put("Pedro", 44);

        System.out.println(estudantes);

        estudantes.put("Pedro", 55);

        System.out.println(estudantes);

        //remove u estudante no indice 0
        estudantes.remove("Pedro");

        System.out.println(estudantes);

        //recupera um estudante no indice 2
        int idadeEstudante = estudantes.get("Mariana");
        System.out.println(idadeEstudante);
        System.out.println(estudantes.size());

    }
}
