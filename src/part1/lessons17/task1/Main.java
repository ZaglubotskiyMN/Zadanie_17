package part1.lessons17.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


public class Main {

    public static void main(String[] args)  {
        Set<String>stringSet = new LinkedHashSet<String>();
        stringSet.add("foo");
        stringSet.add("buzz");
        stringSet.add("bar");
        stringSet.add("fork");
        stringSet.add("bart");
        stringSet.add("spoon");
        stringSet.add("!");
        stringSet.add("dude");
        System.out.println("Вывод без фильтрации:");
        for (String entry :stringSet){
            System.out.print(entry+" ");
        }
        class MyList {
            public void removeEvenLength(){
                Iterator<String> i = stringSet.iterator();
                while (i.hasNext()) {
                    String word = i.next();
                    if (word.length() % 2 == 0) {
                        i.remove();
                        System.out.println(i.next());
                    }
                }
            }


        }


    }

    }






