package generics;

// Sendo Generics invés de Box altera-se para Box<T>
public class Box<T> {
    // private Object object;
    // Subistituindo o Object pelo Generics T
    // T representa  "Type" (tipo)
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
    /* Foram subistituídos pelo bloca acima*/
//    public void set(Object object){
//        this.object = object;
//    }
//    public Object get(){return object;}
}
