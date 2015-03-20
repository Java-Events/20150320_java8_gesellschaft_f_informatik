package org.rapidpm.course.corejava.pattern.structural.adapter.lesson02;

/**
 * Created by sven on 10.02.15.
 */
public class WorkerImpl_A implements Worker {
    @Override
    public String concat(String s1, String s2) {
        return s1.concat(s2);
    }
}
