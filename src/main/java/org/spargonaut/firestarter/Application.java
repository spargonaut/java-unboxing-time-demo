package org.spargonaut.firestarter;

public class Application {
    public static void main(String[] arguments) {
        System.out.println("Hello World!");

//        sumReferenceTypes();
        sumPrimitiveTypes();
    }

    private static void sumPrimitiveTypes() {
        long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println("Max int size: " + Integer.MAX_VALUE);
        System.out.println("Primitive type sum: " + sum);
    }

    private static void sumReferenceTypes() {
        Long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println("Max int size: " + Integer.MAX_VALUE);
        System.out.println("Reference type sum: " + sum);
    }
}
