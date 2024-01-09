import java.util.ArrayList;
import java.util.function.Consumer;
class version_8_lambada_expression {
    public static void main(String args[]) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++) {
            myList.add(i);
        }
        // lambda expersion
        myList.forEach((i) -> {
            System.out.println("myListElement: " + i);
        });

        // using java consumer interface to store lambda expresion
        System.out.println("Using Consumer Interface");
        Consumer<Integer> method = (n) -> {
            System.out.println(n);
        };
        myList.forEach(method);
    }

}