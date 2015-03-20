package p04;

import java.time.Instant;

import org.rapidpm.course.corejava.pattern.structural.adapter.p00.p00.WorkerInterface;

public interface MyWorkerInterface extends WorkerInterface {
	public default void printDateNow(){
		WorkerInterface.super.printDateNow();
        System.out.println("Aktuelles Datum = " + Instant.now());
    };
}
