public class StringClass {
  public static void main(String[] args) {
      String str1 = "Hello,";
      String str2 = " world!";
      
      String result = str1 + str2;
      System.out.println("Concatenated string: " + result);
      
      int length = result.length();
      System.out.println("Length of the string: " + length);

      String substring = result.substring(7, 12);
      System.out.println("Substring: " + substring);

      char character = result.charAt(0);
      System.out.println("Character at index 0: " + character);

      int index = result.indexOf("world");
      System.out.println("Index of 'world': " + index);

      String replaced = result.replace("o", "x");
      System.out.println("String with replaced characters: " + replaced);
      
      String uppercase = result.toUpperCase();
      System.out.println("Uppercase string: " + uppercase);
      
      String lowercase = result.toLowerCase();
      System.out.println("Lowercase string: " + lowercase);
      
      boolean startsWith = result.startsWith("Hello");
      System.out.println("Starts with 'Hello': " + startsWith);
      
      boolean endsWith = result.endsWith("world!");
      System.out.println("Ends with 'world!': " + endsWith);
      
      boolean contains = result.contains("lo,");
      System.out.println("Contains 'lo,': " + contains);
  }
}
