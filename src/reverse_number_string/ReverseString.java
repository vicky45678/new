package reverse_number_string;

public class ReverseString {
  public static void main(String[] args) {
    String input = "Hello World!";
    String output = "";
    
    // loop through the input string from end to start
    for (int i = input.length() - 1; i >= 0; i--) {
      // add each character to the output string
      output += input.charAt(i);
    }
    
    System.out.println(output); // prints "!dlroW olleH"
  }
}
