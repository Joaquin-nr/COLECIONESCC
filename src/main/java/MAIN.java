import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class MAIN {
    public static void main(String[] args) {
        LinkedList<String> caracter= new LinkedList<>();

        caracter.add("a");
        caracter.add("e");
        caracter.add("w");
        caracter.add("t");
        caracter.add("c");
        caracter.add("u");
        caracter.add("q");
        caracter.add("h");
        caracter.add("o");
        caracter.add("m");
        System.out.println(caracter);
        LinkedList<String> creverse = new LinkedList<>(caracter);
        Collections.reverse(creverse);
        System.out.println(creverse);
    }
}
