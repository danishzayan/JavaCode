import java.util.Arrays;

public class NameAsc {

    public static void main(String[] args) {
        String[] names = {"Danish", "Mohtesham","Umar", "Shaquib", "Hamd", "Pasha"};

        // Ascending Order Sorting
        Arrays.sort(names);
        System.out.println("Ascending Order:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}

