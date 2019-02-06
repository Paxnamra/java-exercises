package practise_exercises.samouczekprogramisty.klasy_anonimowe;

public class AnonymousClasses implements GreetingModule {

    public static class Robot {

        private final GreetingModule greetingModule;

        public Robot(GreetingModule greetingModule) {
            this.greetingModule = greetingModule;
        }

        public void saySomething(){
            greetingModule.sayHello();
        }
    }

    @Override
    public void sayHello() {

    }

    public static void main(String[] args) {

        Robot jan = new Robot(new GreetingModule() {

            @Override
            public void sayHello() {
                System.out.println("Dzień dobry!");
            }
        });

        Robot john = new Robot(new GreetingModule() {

            @Override
            public void sayHello() {
                System.out.println("Good morning!");

            }
        });

        Robot jurgen = new Robot(new GreetingModule() {

            @Override
            public void sayHello() {
                System.out.println("Guten Tag!");
            }
        });

        jan.saySomething();
        john.saySomething();
        jurgen.saySomething();

    }
}
