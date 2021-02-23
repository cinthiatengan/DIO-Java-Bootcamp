package JavaList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class exemploList {
    public static void main(String[] args){
        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);

        Collections.sort(nomes); // ordenação simples por ordem alfabetica

        System.out.println(nomes);

        nomes.set(2, "Anitta"); //troca o conteudo pelo indice do elemento que vc quer
        System.out.println(nomes);

        nomes.remove(4); // remove o elemento do indice
        System.out.println(nomes);

        nomes.remove("João");
        System.out.println(nomes);

        String nome = nomes.get(0); //retona o elemento segundo o indice indicado
        System.out.println(nome);

        int tamanho = nomes.size(); //mostra tamnanho da lista
        System.out.println(tamanho);

        nomes.remove("Anitta");
        tamanho = nomes.size();

        System.out.println(tamanho);

        boolean temAnderson = nomes.contains("Anderson"); //verifica se é verdadeiro ou falso a existencia de um elemento na lista
        System.out.println(temAnderson);

        boolean listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);

        // nomes.clear(); //esvazia a lista

        int posicao = nomes.indexOf("Carlos"); // mostra o indice do elemento na lista
        System.out.println(posicao);

        for (String nomeDoItem: nomes){
            System.out.println("--->"+ nomeDoItem);
        }
        Iterator<String> iterator = nomes.iterator();
        while(iterator.hasNext()){
            System.out.println("------->>"+iterator.next());
        }
    }
}
