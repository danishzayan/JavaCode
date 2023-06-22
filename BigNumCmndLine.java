public class BigNumCmndLine {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No numbers provided.");
            return;
        }

        // Assume the first number is the largest
        int max = Integer.parseInt(args[0]);

        for (int i = 1; i < args.length; i++) {
            int current = Integer.parseInt(args[i]);
            if (current > max) {
                max = current;
            }
        }

        System.out.println("The biggest number is: " + max);
    }
}
