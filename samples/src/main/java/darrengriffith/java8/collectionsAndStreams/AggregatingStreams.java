/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darrengriffith.java8.collectionsAndStreams;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

/**
 *
 * @author darrengriffith
 */
public class AggregatingStreams {

    public void execute() {

        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            strings.add("Item " + i);
        }

        long count = strings.parallelStream().count();
        System.out.println("Count: " + count);

        long sum = strings.parallelStream()
                .mapToInt(p -> p.length())
                .sum();
        System.out.println("Number of charaters: " + sum);

        //
        //
        //
        Instant start = Instant.now();

        OptionalDouble ave = strings.parallelStream()
                .mapToInt(p -> p.length())
                .average();

        Instant end = Instant.now();
        Duration parallelTime = Duration.between(start, end);

        if (ave.isPresent()) {
            System.out.println("Average characters: " + ave.getAsDouble());
        } else {
            System.out.println("Average NaN");
        }

        start = Instant.now();

        ave = strings.stream()
                .mapToInt(p -> p.length())
                .average();

        end = Instant.now();
        Duration serialTime = Duration.between(start, end);
        
        if (ave.isPresent()) {
            System.out.println("Average characters: " + ave.getAsDouble());
        } else {
            System.out.println("Average NaN");
        }
        
        System.out.println("Parallel calculation took " + parallelTime.toMillis() + " ms");
        System.out.println("Serial calculation took " + serialTime.toMillis() + " ms");
    }
}
