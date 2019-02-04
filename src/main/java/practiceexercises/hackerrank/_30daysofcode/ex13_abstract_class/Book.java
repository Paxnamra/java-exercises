package practiceexercises.hackerrank._30daysofcode.ex13_abstract_class;

abstract class Book {

    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}

