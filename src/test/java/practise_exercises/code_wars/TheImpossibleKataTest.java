package practise_exercises.code_wars;

import org.junit.Assert;
import org.junit.Test;
import practise_exercises.code_wars.the_impossible_kata.FinalBoolean;
import practise_exercises.code_wars.the_impossible_kata.TheImpossibleKata;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class TheImpossibleKataTest {

    TheImpossibleKata kataInstance = new TheImpossibleKata();

    @Test
    public void test() throws ReflectiveOperationException {
        //This test will always fail... :(
        setFinalStaticField(FinalBoolean.class, "FALSE", true);
        Assert.assertTrue("Failed obviously...FALSE is NOT TRUE", FinalBoolean.FALSE);
    }

    private static void setFinalStaticField(Class<?> clazz, String fieldName, Object value) {

        try {
            Field field = clazz.getDeclaredField(fieldName);
            field.setAccessible(true);

            Field modifiers = field.getClass().getDeclaredField("modifiers");
            modifiers.setAccessible(true);
            modifiers.setInt(field, field.getModifiers() & ~Modifier.FINAL);

            field.set(null, value);
        } catch (ReflectiveOperationException roe) {
            roe.printStackTrace();
        }
    }
}