package p03.childab;

import org.rapidpm.course.corejava.basics.basics04.l01.p00.Main;

/**
 * Created by ccw on 20.03.15.
 */
public class MyMain {

    public static void main(String[] args) {
        Main m = new Main();
        Main.ChildB b = m.new ChildB();
        b.workA();
        b.workB();
    }
}
