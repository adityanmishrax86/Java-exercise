package generics;

public class Gen<T>{
    T ob;

    public Gen(T o) {
        ob = o;
    }

    public T getOb() {
        return ob;
    }

    public void showType() {
        System.out.println("Type of the T is"+ ob.getClass().getName());
    }
}
