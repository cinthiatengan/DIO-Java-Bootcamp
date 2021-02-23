package JavaList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class exemploQueue {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flavio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);
        //nao da pra alterar o elemento dentro da fila!!

        String clienteASerAtendido = filaBanco.poll(); //remove o primeiro da fila
        System.out.println(clienteASerAtendido);
        System.out.println(filaBanco);

        String primeiroCliente = filaBanco.peek(); //retorna o priemiro elemento da fila mas nao remove
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);

        String primeiroClienteOuErro = filaBanco.element(); // retorna erro se o elemento nao estiver na fila
        System.out.println(primeiroClienteOuErro);
        System.out.println(filaBanco);

        //navegar nos elementos
        for (String client: filaBanco){
            System.out.println(client);
        }
        Iterator<String> iteratorFilaBanco = filaBanco.iterator();

        while(iteratorFilaBanco.hasNext()){
            System.out.println("--->"+ iteratorFilaBanco.next());
        }

        System.out.println(filaBanco.size());

        System.out.println(filaBanco.isEmpty());
    }
}
