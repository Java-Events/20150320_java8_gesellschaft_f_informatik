package org.rapidpm.course.java8.gi.streams.chap_1_3.uebung;

import org.rapidpm.course.java8.streams.DemoValueGenerator;
import org.rapidpm.course.java8.streams.WorkLoadGenerator;
import org.rapidpm.course.java8.streams.chap_1_3.Worker;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.rapidpm.course.java8.streams.chap_1_3.Worker.ANZAHL_KURVEN;

/**
 *
 * @author jcb
 */
public class WorkerStreamJCB implements Worker {

    private static final DemoValueGenerator valueGenerator = new DemoValueGenerator() {
    };
    private static final WorkLoadGenerator generator = new WorkLoadGenerator();

    @Override
    public List<List<Double>> generateInterpolatedValues(List<List<Integer>> baseValues) {
        return baseValues.parallelStream()
                .map(generator::generate)  //thread save ??
                .collect(toList());
    }

    @Override
    public List<List<Integer>> generateDemoValueMatrix() {
//        final Stream.Builder<List<Integer>> builder = Stream.<List<Integer>>builder();
//        for (int i = 0; i < ANZAHL_KURVEN; i++) {
//            builder.add(valueGenerator.generateDemoValuesForY());
//        }
        return Stream
                .generate(valueGenerator::generateDemoValuesForY)
                .limit(ANZAHL_KURVEN)
                .collect(Collectors.toList());
//        return builder.build().collect(toList());
    }

}
