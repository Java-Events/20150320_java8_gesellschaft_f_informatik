package org.rapidpm.course.corejava.pattern.structural.adapter.lesson01;

/**
 * Created by Sven Ruppert on 19.09.2014.
 */
public class LegacyService {
  public String concat(String[] strs){
    String result = "";
    for (final String str : strs) {
      result = result + str;
    }
    return result;
  }
}
