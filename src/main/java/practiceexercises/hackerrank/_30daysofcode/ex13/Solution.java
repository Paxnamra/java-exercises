package practiceexercises.hackerrank._30daysofcode.ex13;

import java.util.Scanner;

public class Solution {

//       --- all was about filling up MyClass with parameters, constructor and overriding method coming from inherited abstract parent ---
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

//      --- I'm wondering why would experienced programmer use abstract classes instead of anything else of similar functionality available in Java ---
//      --- the line of code below took me a while, instance of a MyBook class with reference type abstract parent class ---
        Book book = new MyBook(title, author, price);
        book.display();
    }
}

/*
Sample input:

The Alchemist
Paulo Coelho
248

*/