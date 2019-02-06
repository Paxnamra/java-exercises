package practise_exercises.hackerrank._30daysofcode.ex12_inheritance_chargrade_calculation;

public class Person {

    private String firstName;
    private String lastName;
    private int idNumber;

    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }
}
