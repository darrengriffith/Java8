package darrengriffith.java8.functionalInterfaces;

public class Test {
    public static void main(String[] args) {
        System.out.println("Functional Interfaces");
        
        TestInterface tester = () -> System.out.println("Lamda Function Works");
        tester.test();
    }
}