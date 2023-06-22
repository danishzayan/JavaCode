public class TypeCasting {
    public static void main(String[] args) {
  
        int myInt = 100;
        long myLong = myInt; 

        System.out.println("Implicit Casting:");
        System.out.println("myInt: " + myInt);
        System.out.println("myLong: " + myLong);

        // Explicit Type Casting 
        double myDouble = 123.456;
        int myNewInt = (int) myDouble;

        System.out.println("\nExplicit Casting:");
        System.out.println("myDouble: " + myDouble);
        System.out.println("myNewInt: " + myNewInt);
    }
}

