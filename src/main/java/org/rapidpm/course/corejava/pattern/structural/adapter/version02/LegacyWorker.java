package org.rapidpm.course.corejava.pattern.structural.adapter.version02;

import java.util.Arrays;

/**
 * Created by Sven Ruppert on 19.09.2014.
 */
public class LegacyWorker {
  public void writeTheStrings(String[] strArray){
    Arrays.stream(strArray).forEach(System.out::println);
  }
}
