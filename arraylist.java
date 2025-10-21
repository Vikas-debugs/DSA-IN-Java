import java.util.ArrayList;
import java.util.Collection;
import java.util.*;
class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // add elements
        list.add(4);
        list.add(9);
        System.out.println(list);
        int elements = list.get(0);
        System.out.println(elements);

        // add in between
        list.add(1, 1);
        System.out.println(list);

        // set element
        list.set(0, 989);
        System.out.println(list);
        // delete element
        list.remove(2);
        System.out.println(list);
       int size = list.size();
       System.out.println(size);
        for( int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println();

        //SORTING
        Collections.sort(list);
        System.out.println(list);
    }
}
