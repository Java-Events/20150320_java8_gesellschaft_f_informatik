package org.rapidpm.course.corejava.basics.basics04.l01.p00;

/**
 * Created by sven on 20.03.15.
 */
public class Main {

    public static class ChildA{
        public void workA(){
            System.out.println( this.getClass().getSimpleName());
        }
        public void workB(){
            System.out.println(ChildA.class.getSimpleName());
        }
    }
    public class ChildB{
        public void workA(){
            System.out.println( this.getClass().getSimpleName());
        }
        public void workB(){
            System.out.println(ChildA.class.getSimpleName());
        }
    }





    public static void main(String[] args) {
        ChildA childA = new ChildA();
        childA.workA();
        childA.workB();
    }



}
