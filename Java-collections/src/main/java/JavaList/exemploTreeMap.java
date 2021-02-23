package JavaList;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class exemploTreeMap {
    public static void main(String[] args) {
        TreeMap<String, String> treeCapitais = new TreeMap<>();

        //monta a arvore com as capitais
        treeCapitais.put("RS", "Porto Alegre");
        treeCapitais.put("SC", "Florianopolis");
        treeCapitais.put("PR", "Curitiba");
        treeCapitais.put("SP", "Sao Paulo");
        treeCapitais.put("RJ", "Rio de Janeiro");
        treeCapitais.put("MG", "Belo Horizonte");

        System.out.println(treeCapitais);

        //retorna a primeira capital no topo da arvore
        System.out.println(treeCapitais.firstKey());

        //retorna a ultima capital no final da arvore
        System.out.println(treeCapitais.lastKey());

        //retorna a priemira capital abaixo na arvore da capital parametrizada
        System.out.println(treeCapitais.lowerKey("SC"));

        //retorna a primeira capital acima na arvore da capital
        System.out.println(treeCapitais.higherKey("SC"));

        //Exibe todas as capitais no console
        System.out.println(treeCapitais);

        // retorna a primeira capital no topo da arvore
        System.out.println(treeCapitais.firstEntry().getKey()+"---"+treeCapitais.firstEntry().getValue());

        //retorna a ultima capital no final da arvore
        System.out.println(treeCapitais.lastEntry().getKey()+"--"+treeCapitais.lastEntry().getValue());

        // exibe todas as capitais no console
        System.out.println(treeCapitais);

        // navega em todos as chaves do iterator
        Iterator<String> iterator = treeCapitais.keySet().iterator();

        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key+"--"+treeCapitais.get(key));
        }
        for (Map.Entry<String, String> capital: treeCapitais.entrySet()){
            System.out.println(capital.getKey()+"--"+ capital.getValue());
        }
     }
}
