package kata.effective.java.item52;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetList {

  public static void setList(){
    Set<Integer> set =  new TreeSet<>();
    List<Integer> list =  new ArrayList<>();

    for (int i = -3; i < 3 ; i++) {
      set.add(i);
      list.add(i);
    }

    for (int i = 0; i < 3; i++) {
      set.remove(i);
      list.remove(Integer.valueOf(i));
    }

    System.out.println(set + " " +list);
  }

}
