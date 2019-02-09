package practise_exercises.samouczek_programisty.wyrazenia_lambda;

public class Human {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}
