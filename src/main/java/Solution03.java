import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args) {
        /* Ask what the quote is
        Then store said quote
        Ask who said it
        Then store who said it
        Then repeat the quote
         */
        Scanner in = new Scanner(System.in);
        System.out.print("What is the quote? ");
        String quote = in.nextLine();
        System.out.print("Who said it? ");
        String quoteTeller = in.nextLine();
        System.out.println(quoteTeller + " says, \"" + quote + "\"");
    }
}
