package oop.finalexam.t1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Lists {
   public static void main(String[] args) {
      List<Integer> listA = new ArrayList(Arrays.asList(4, 2, 7, 3, 6, 1, 5, 8, 10, 9));
      List<String> listB = new ArrayList(Arrays.asList("lnd", "vbq", "vsk", "lsd", "twe", "lyq", "oyu", "jom", "oay", "zjr", "zhu", "oxu"));
      List<Integer> mappingIndices = new ArrayList(Arrays.asList(5, 3, 8, 4, 7, 2, 6, 9, 11, 10));
      List<String> listC = new ArrayList();

      int i;
      for(int i = 0; i < listA.size(); ++i) {
         i = (Integer)listA.get(i);
         String stringFromB = (String)listB.get((Integer)mappingIndices.get(i));
         listC.add(stringFromB + i);
      }

      System.out.println("✅ Intermediate Combined List (List C): " + String.valueOf(listC));
      List<String> filteredListWithNumbers = new ArrayList();

      for(i = 0; i < listC.size(); ++i) {
         if (!listA.contains(i)) {
            filteredListWithNumbers.add((String)listC.get(i));
         }
      }

      System.out.println("✅ Filtered List (before removing integers): " + String.valueOf(filteredListWithNumbers));
      List<String> finalList = new ArrayList();
      Iterator var11 = filteredListWithNumbers.iterator();

      while(var11.hasNext()) {
         String item = (String)var11.next();
         finalList.add(item.replaceAll("\\d", ""));
      }

      System.out.println("\ud83c\udfc1 Final List (after eliminating integers): " + String.valueOf(finalList));
   }
}
