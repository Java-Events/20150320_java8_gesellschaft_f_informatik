package org.rapidpm.course.corejava.pattern.structural.adapter.version01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sven Ruppert on 15.09.2014.
 */
public class Service {

  private List<ServiceAction> serviceActionList = new ArrayList<>();

  public void addServiceAction(ServiceAction action){
    serviceActionList.add(action);
  }

  public void work(final String string){
    serviceActionList.forEach(v->v.execute(string));
  }

  @FunctionalInterface
  public static interface ServiceAction {
    public void execute(final String string);
  }
}
