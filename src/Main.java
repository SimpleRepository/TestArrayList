import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int i = 0;

        for ( i = 0; i < 100; i++) {
            arrayList.add(i);
        }

        System.out.println(arrayList.toString());
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(--i));
        System.out.println(arrayList.size());
    }
}
