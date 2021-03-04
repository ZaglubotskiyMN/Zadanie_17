package part1.lessons17.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


public class Main {

    public static void main(String[] args) {

        Set<String> stringSet = new LinkedHashSet<>();
        stringSet.add("foo");
        stringSet.add("buzz");
        stringSet.add("bar");
        stringSet.add("fork");
        stringSet.add("bort");
        stringSet.add("spoon");
        stringSet.add("!");
        stringSet.add("dude");
        System.out.println("Вывод без фильтрации:");
        for (String entry:stringSet){
            System.out.println(entry+" ");
        }
        System.out.println("Вывод с фильтрацией");
        System.out.println(removeEvenLength(stringSet));
    }

    public static Set<String> removeEvenLength(Set<String>set){
        if (!set.isEmpty()) {
            set.removeIf(s -> (s.length() % 2) == 0);
        }
        return set;
    }
}








