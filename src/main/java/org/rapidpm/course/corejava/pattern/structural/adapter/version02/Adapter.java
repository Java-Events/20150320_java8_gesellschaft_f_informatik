package org.rapidpm.course.corejava.pattern.structural.adapter.version02;

import java.util.List;

/**
 * Created by Sven Ruppert on 19.09.2014.
 */
public class Adapter implements WorkerAdapter {
  private LegacyWorker worker = new LegacyWorker();
  @Override
  public void workOnSomething(List<String> stringListe) {
    final String[] strings = stringListe.toArray(new String[0]);
    worker.writeTheStrings(strings);
  }
}
