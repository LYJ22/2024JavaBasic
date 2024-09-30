/*


*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(4);
        hs.add(2);
        hs.add(1);

        Iterator<Integer> iter = hs.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next()+" ");
        }

        HashMap<Integer, Integer> hm = new HashMap<>();

    }
}