package p03.defaultinterface;

/**
 * Created by ccw on 20.03.15.
 */
public interface Interface1 {

    public default void doSmth() {
        System.out.println("Interface1");
    }
}
