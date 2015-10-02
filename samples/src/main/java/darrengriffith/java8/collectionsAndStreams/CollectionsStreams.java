/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darrengriffith.java8.collectionsAndStreams;

/**
 *
 * @author darrengriffith
 */
public class CollectionsStreams {

    public static void main(String[] args) {

        System.out.println("\n--- Collections and Streams ---\n");

        // 
        // Sequential Stream
        //
        System.out.println("\n~~ Sequential Stream ~~");
        
        SequentialStreams ss = new SequentialStreams();
        ss.execute();
        
        //
        // Parallel Streams
        //
        System.out.println("\n~~ Parallel Stream ~~");
        
        ParallelStreams ps = new ParallelStreams();
        ps.execute();
        
        //
        // Collections from Arrays
        //
        System.out.println("\n~~ Collections from Arrays ~~");
        
        CollectionsFromArrays cfa = new CollectionsFromArrays();
        cfa.execute();
        
        //
        // Aggregations
        //
        System.out.println("\n~~ Aggregations ~~");
        
        AggregatingStreams as = new AggregatingStreams();
        as.execute();
    }
}
