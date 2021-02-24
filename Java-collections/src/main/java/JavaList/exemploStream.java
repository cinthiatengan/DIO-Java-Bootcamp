package JavaList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class exemploStream {
    public static void main(String[] args) {
        //cria coleção de estudantes
        List<String> estudantes = new ArrayList<>();

        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");

        //retorna a contagem de elementos do stream
        System.out.println("Contagem: " +estudantes.stream().count());

        //retorna o elemento com maior numero de letras
        System.out.println("Maior numero de letras: "+ estudantes.stream().max(Comparator.comparingInt(String::length)));

        // retorna o elemento com menor numero de letras
        System.out.println("Menor numero de letras: "+ estudantes.stream().min(Comparator.comparingInt(String::length)));

        //retorna os elementos que tem a letra R no nome
        System.out.println("Com a letra r no nome: "+ estudantes.stream().filter((estudante)-> estudante.toLowerCase().contains("r")).collect((Collectors.toList())));

        //retorna somente os 3 primeiros elementos da coleção
        System.out.println("Retorna os 3 primeiros elementos: "+estudantes.stream().limit(3).collect(Collectors.toList()));

        //retorna uma nova coleção, com os nomes concatenados a quantidade de letras de cada nome
        System.out.println("Retorna uma nova coleção com a quantidade de letras: "+ estudantes.stream().map(estudante -> estudante.concat("--").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        //Exibe cada elemento no console e depois retorna a mesma coleção
        System.out.println("Retorna os elementos: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        //exibe cada elemento no console sem retornar outra coleção
        System.out.println("Retorna os elementos novamente: ");
        estudantes.stream().forEach(System.out::println);


    }
}
