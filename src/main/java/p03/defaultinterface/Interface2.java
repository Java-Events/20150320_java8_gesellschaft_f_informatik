package p03.defaultinterface;

import p03.defaultinterface.Interface1;

/**
 * Created by ccw on 20.03.15.
 */
public interface Interface2 extends Interface1 {

    @Override
    public default void doSmth() {
        System.out.println("Interface2");
        Interface1.super.doSmth();
    }

}
