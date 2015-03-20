package org.rapidpm.course.corejava.pattern.structural.adapter.version02;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Sven Ruppert on 19.09.2014.
 */
public class Main {
  public static void main(String[] args) {
    Adapter adapter = new Adapter();
    final ArrayList<String> strings = new ArrayList<>();
    Collections.addAll(strings, "A","B","C","D");
    adapter.workOnSomething(strings);
  }
}
