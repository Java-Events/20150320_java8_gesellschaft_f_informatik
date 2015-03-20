package org.rapidpm.course.corejava.pattern.structural.adapter.p00.p00;

import java.time.Instant;

/**
 * Created by sven on 20.03.15.
 */
public interface WorkerInterface {
    public default void printDateNow(){
        System.out.println("Instant.now() = " + Instant.now());
    };
}
