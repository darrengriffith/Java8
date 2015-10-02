package darrengriffith.java8.functionalInterfaces;

public class Lamda {

    public static void main(String[] args) {
        
        System.out.println("\n--- Functional Interfaces ---\n");
        
        //
        // No Args
        //
        System.out.println("\n~~ Lamda Functions ~~");
        
        LamdaFunction lamdaObject = () -> System.out.println("The Lamda Function Works");
        lamdaObject.lambdaFunction();
        
        LamdaFunction lamdaObject2 = () -> System.out.println("The 2nd Lamda Function Works");
        lamdaObject2.lambdaFunction();
        
        //
        // Args
        //
        LamdaFunctionArgs lambdaObjectArgs = (v1, v2) -> {
            for(int i = 0; i < v2; i++) {
                System.out.println(v1);
            }
        };
        lambdaObjectArgs.lamdaFunction("Lamda with args 5 times", 5);
        
        LamdaFunctionArgs lamdaObjectArgs2 = (v1, v2) -> {
            System.out.println(v1 + ":" + Integer.toString(v2));
        };
        lamdaObjectArgs2.lamdaFunction("The number two", 2);
        
        //
        // Lamda vs Inner Class
        //
        System.out.println("\n~~ Lamba vs Inner Class ~~");
        
        InnerClassVsLamda.executeInnerClass();
        InnerClassVsLamda.executeLamda();
        
        //
        // ForEach
        //
        System.out.println("\n~~ ForEach ~~");
        
        LamdaForEach fe = new LamdaForEach();
        fe.executeFor();
        fe.executeForEach();
        
        //
        // Predicate
        //
        System.out.println("\n~~ Predicates ~~");
        
        LamdaPredicate predicate = new LamdaPredicate();
        predicate.executeInnerClass();
        predicate.executeLamda();
        
        //
        // Method References
        //
        System.out.println("\n~~ Method References ~~");
        
        MethodReferences mr = new MethodReferences();
        mr.execute();
        
        //
        // Default Interface Method
        //
        System.out.println("\n~~ Default Methods ~~");
        
        DefaultMethods dm = new DefaultMethods();
        dm.execute();
    }
}
