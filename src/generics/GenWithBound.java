package generics;

public class GenWithBound<T extends Number> {
    T[] ob;

    public GenWithBound(T[] o){
        ob = o;
    }

    public double average() {
        double sum = 0.0;
        for (int i =0; i < ob.length; i++)
            sum = sum + ob[i].doubleValue();

        return sum;
    }
}
