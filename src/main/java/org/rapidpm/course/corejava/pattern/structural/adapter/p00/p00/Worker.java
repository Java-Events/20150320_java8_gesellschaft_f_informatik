package org.rapidpm.course.corejava.pattern.structural.adapter.p00.p00;

import java.time.Instant;

/**
 * Created by sven on 20.03.15.
 */
public class Worker implements WorkerInterface {

//    public void printDateNow(){
//        System.out.println("Instant.now() = " + Instant.now());
//    }

    public static void main(String[] args) {
        new Worker().printDateNow();
        new WorkerInterface(){}.printDateNow();
    }

}
