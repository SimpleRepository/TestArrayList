import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        int i = 0;

        for ( i = 0; i < 10; i++) {
            list.add(i);
        }

        System.out.println(list.toString());
        System.out.println(list.get(0));
        System.out.println(list.get(--i));
        System.out.println(list.size());

        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }

        list.remove(5);

        for(Object s:list){
            System.out.println(s);
        }

        list = new LinkedList<Integer>();
    }
}
