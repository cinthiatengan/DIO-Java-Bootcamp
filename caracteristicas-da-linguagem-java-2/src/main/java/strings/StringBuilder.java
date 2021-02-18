package strings;

public class StringBuilder {

  public static void main(String[] args) {

    var nome = "Andre";

    final var builder = new java.lang.StringBuilder(nome);
    System.out.println(builder.append("Luis"));

    final var reverse = builder.reverse();

    System.out.println(reverse);

    final var insert = reverse.insert(0, "#").insert(reverse.length(), "#");
    System.out.println(insert);

    //exercicio da aula

    System.out.println("A B C D E F G H".toCharArray());
    System.out.println("Aula de Java".split(" "));
    System.out.println("Aula".concat(" de Java"));
    System.out.println("1234 asda qw".replaceAll("[0,9]", "#"));
  }

}
