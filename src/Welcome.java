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

        Gen<Integer> obj = new Gen<Integer>(20);

        System.out.println(obj.getOb());
        obj.showType();
        Integer[] j = {1,2,3,4,5,6};
        GenWithBound<Integer> oj = new GenWithBound<Integer>(j);
        System.out.println(oj.average());
    }

}