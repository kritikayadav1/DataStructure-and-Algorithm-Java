package ArrayList2;

import java.util.*;

public class Multidimensional {
           public static void main(String[] args) {
 // Main ArrayList - iske andar ArrayLists store hongi
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
    // 3 alag ArrayLists
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        // Lists me values add karna
        for (int i = 1; i <= 5; i++) {
            list1.add(i * 1);
            list2.add(i * 2);
            list3.add(i * 3);
        }

        // Teen lists ko mainList me add karna
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        // Puri mainList print
        System.out.println(mainList);


        // Ek-ek list nikalna
        for (int i = 0; i < mainList.size(); i++) {

            ArrayList<Integer> currList = mainList.get(i);

            // Current list ke elements print karna
            for (int j = 0; j < currList.size(); j++) {

                System.out.print(currList.get(j) + " ");
            }

            System.out.println();
        }
    }
}