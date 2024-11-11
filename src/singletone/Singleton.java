package singletone;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;
    private volatile static Singleton instance;

    private Singleton() {
        if (instance != null) {
            throw new IllegalStateException("Object cannot be copy by Reflection API");
        }
    }

    //serialization prevention
    protected Object readResolve() {
        return instance;

    }

    public static Singleton getSingletoneInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }

        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        throw new CloneNotSupportedException();
        //    return super.clone();
    }

}
