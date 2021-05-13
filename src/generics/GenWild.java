package generics;

public class GenWild<T extends Number>{
    T[] ob;

    public GenWild(T[] o){
        ob = o;
    }

    public double average() {
        double sum = 0.0;
        for (int i =0; i < ob.length; i++)
            sum = sum + ob[i].doubleValue();

        return sum/ ob.length;
    }

    /**
     * This method compares one object with another
     * @param obx obx with ? wildcard that means we can add any object, if T is provided then it will go with
     *            Obj instantiation
     * @return true/ false if matches
     */
    // wildcard be bounded ? extends Number
    public boolean sameAvg(GenWild<? extends Number> obx) {
        if(average() == obx.average())
            return true;
        return false;
    }
}
