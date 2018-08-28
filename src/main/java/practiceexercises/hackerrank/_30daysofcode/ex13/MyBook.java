package practiceexercises.hackerrank._30daysofcode.ex13;

class MyBook extends Book{

    private int price;

    private int getPrice() {
        return price;
    }

    MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    @Override
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + getPrice());
    }
}
