package org.rapidpm.course.corejava.pattern.structural.adapter.p00;

/**
 * Created by sven on 20.03.15.
 */
public class Adapter implements ClassAdapter {

    private OldClass oldClass = new OldClass();

    @Override
    public String workAt() {
        return oldClass.work();
    }
}
