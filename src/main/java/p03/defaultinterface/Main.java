package p03.defaultinterface;

import p03.defaultinterface.Interface1;
import p03.defaultinterface.Interface2;

/**
 * Created by ccw on 20.03.15.
 */
public class Main {

    public static void main(String[] args) {
        new Interface1(){}.doSmth();
        new Interface2(){}.doSmth();
    }

}
