package org.rapidpm.course.corejava.pattern.structural.adapter.lesson01.p00;

import org.rapidpm.course.corejava.pattern.structural.adapter.lesson01.LegacyService;

import java.util.Collection;

/**
 * Created by sven on 10.02.15.
 */
public class AdapterImpl implements Adapter {

    private LegacyService service = new LegacyService();

    public String concat(Collection<String> strs) {
        final String[] toArray = strs.toArray(new String[strs.size()]);
        return service.concat(toArray);
    }
}
