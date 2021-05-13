import algorithms.*;
import arrays.BinarySearch;
import arrays.BubbleSort;
import arrays.LinearSearch;
import arrays.SelectionSort;
import problems.*;
import generics.*;

public class Welcome {
    public static void main(String[] args) {
        System.out.println("This is the base class where all the exercises will pass on.");

        Integer inums[] = {3,6,2,5,2,5};
        Character chs[] = {'b','c','d','e','x'};

        AneClass<Integer> x = new AneClass<>(inums);
        AneClass<Character> y = new AneClass<>(chs);

        System.out.println(x.min());
        System.out.println(x.max());

        System.out.println(y.min());
        System.out.println(y.max());

    }

}