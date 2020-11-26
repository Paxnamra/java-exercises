package practise_exercises.code_wars.the_impossible_kata;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class TheImpossibleKata {
    public void reflection() throws NoSuchFieldException, IllegalAccessException {
        Field privateFi = FinalBoolean.class.getField("FALSE");
        privateFi.setAccessible(true);

        Field modifiersField = Field.class.getDeclaredField( "modifiers" );
        modifiersField.setAccessible( true );
        modifiersField.setInt( privateFi, privateFi.getModifiers() & ~Modifier.FINAL );

        privateFi.set(null, true);
    }

    public static void main(String[] args) throws ReflectiveOperationException {
        TheImpossibleKata kata = new TheImpossibleKata();

        Class cls = FinalBoolean.class;
        System.out.println("Simple name: " + cls.getSimpleName());
        System.out.println("Actual boolean value: " + FinalBoolean.FALSE);

        Field privateField = FinalBoolean.class.getDeclaredField("FALSE");
        privateField.setAccessible(true);

        Field modifiersField = Field.class.getDeclaredField( "modifiers" );
        modifiersField.setAccessible( true );
        modifiersField.set( privateField, privateField.getModifiers() & ~Modifier.FINAL );



        //privateFi.set(objTest, true);
        //System.out.println("objTest value: " + privateFi.get(objTest)); // prints "private string"


        Boolean fieldValue = (Boolean) privateField.get(null);
        System.out.println(fieldValue); // -> false

        privateField.set(null, true);
        System.out.println(FinalBoolean.FALSE); // -> true

        setFinalStaticField(FinalBoolean.class, "FALSE", true);
        System.out.println(FinalBoolean.FALSE);






    }

    private static void setFinalStaticField(Class<?> clazz, String fieldName, Object value)
            throws ReflectiveOperationException {

        Field field = clazz.getDeclaredField(fieldName);
        field.setAccessible(true);

        Field modifiers = Field.class.getDeclaredField("modifiers");
        modifiers.setAccessible(true);
        modifiers.setInt(field, field.getModifiers() & ~Modifier.FINAL);

        field.set(null, value);
    }
}
