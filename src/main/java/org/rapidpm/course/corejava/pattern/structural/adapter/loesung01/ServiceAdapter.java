package org.rapidpm.course.corejava.pattern.structural.adapter.loesung01;

import org.rapidpm.course.corejava.pattern.structural.adapter.lesson01.LegacyService;

import java.util.Collection;

/**
 * Created by Sven Ruppert on 19.09.2014.
 */
public class ServiceAdapter {

  private LegacyService service = new LegacyService();

  public String concat(Collection<String> strs) {
    final String[] toArray = strs.toArray(new String[strs.size()]);
    return service.concat(toArray);
  }
}
