package darrengriffith.java8.main;

import darrengriffith.java8.collectionsAndStreams.CollectionsStreams;
import darrengriffith.java8.functionalInterfaces.Lamda;
import darrengriffith.java8.javaScript.JavaScript;
import darrengriffith.java8.misc.Misc;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n\n*** Java 8 Samples ***\n\n");

        Lamda.main(args);
        
        CollectionsStreams.main(args);
        
        JavaScript.main(args);
        
        Misc.main(args);

        System.out.println("\n\n");
    }
}
