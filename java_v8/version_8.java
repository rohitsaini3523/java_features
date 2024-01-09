import java.util.ArrayList;

class version_8 {
    public static void main(String args[]) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }
        myList.forEach((i) -> {
            System.out.println("myListElement: " + i);
        });
    }

}