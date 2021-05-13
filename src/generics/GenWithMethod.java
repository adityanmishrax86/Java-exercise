package generics;

public class GenWithMethod {

    /**
     *
     * @param x A single entity
     * @param y An array of entities
     * @param <T> Type of object which is Comparable
     * @param <V> Type of object to compare withiin
     * @return ture if found else false
     */
    public static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
        for(int i =0; i < y.length; i++)
            if(x == y[i])
                return true;
        return false;
    }
}
