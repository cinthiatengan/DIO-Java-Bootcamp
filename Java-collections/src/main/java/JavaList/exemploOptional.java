package JavaList;

import java.util.Optional;

public class exemploOptional {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Valor presente");

        System.out.println("Valor opcional que está presente");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Não esta presente"));

        Optional<String> optionalNull = Optional.ofNullable(null);

        System.out.println("Valor opcional que não esta presente");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = não esta presente"));

        Optional<String> emptyOptional = Optional.empty();

        System.out.println("Valor opcional que não esta presente");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("null = não esta presente"));

        Optional<String> optionalNullErro = Optional.of(null);

        System.out.println("Valor opcional que lança erro NullPointerException");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = não esta presente"));
    }
}
