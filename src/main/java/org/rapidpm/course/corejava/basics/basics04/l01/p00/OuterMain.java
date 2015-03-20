package org.rapidpm.course.corejava.basics.basics04.l01.p00;

/**
 * Created by sven on 20.03.15.
 */
public class OuterMain {
    public static void main(String[] args) {
        Main.ChildA childA = new Main.ChildA();
        childA.workA();
        childA.workB();

        new Main().new ChildB().workA();
        new Main().new ChildB().workB();

    }
}
