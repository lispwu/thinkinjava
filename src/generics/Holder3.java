package generics;

public class Holder3<T> {
    private T a;
    public Holder3(T a){
        this.a = a;
    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }
}
