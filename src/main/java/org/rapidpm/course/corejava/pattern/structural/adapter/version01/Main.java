package org.rapidpm.course.corejava.pattern.structural.adapter.version01;


/**
 * Created by Alexander Bischof on 02.09.14.
 */
public class Main {

  public static void main(String[] args) {
//    Service service = new Service();
//    service.addServiceAction(new Service.ServiceAction() {
//      @Override
//      public void execute(String string) {
//        System.out.println("string = " + string);
//      }
//    });
//    service.work("HAllo");

    Service service = new Service();
    service.addServiceAction(string
        -> System.out.println("string = " + string));
    service.work("Hallo");
  }




}
