import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyClassTest {

    private final String stringA = "A";
    private final int intOne = 1;
    private final String methodNamePrivateSetMyString = "privateSetMyString";
    private final String methodNamePrivateSetMyStringReturningBool = "privateSetMyStringReturningBool";
    private final String methodNamePrivateSetMyInt = "privateSetMyInt";
    private MyClass myClass;

    @Before
    public void setUp() {
        myClass = new MyClass();
    }

    @Test
    public void setStringToAUsingProtected() {
        myClass.protectedSetMyString(stringA);
        assertEquals(stringA, myClass.getMyString());
    }

    @Test
    public void setStringToAUsingPrivate() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = MyClass.class.getDeclaredMethod(methodNamePrivateSetMyString, String.class);
        method.setAccessible(true);
        method.invoke(myClass, stringA);
        assertEquals(stringA, myClass.getMyString());
    }

    @Test
    public void setStringToAReturningBoolUsingPrivate() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = MyClass.class.getDeclaredMethod(methodNamePrivateSetMyStringReturningBool, String.class);
        method.setAccessible(true);
        boolean ret = (boolean) method.invoke(myClass, stringA);
        assertEquals(stringA, myClass.getMyString());
        assertTrue(ret);
    }

    @Test
    public void setIntToOneUsingPrivate() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = MyClass.class.getDeclaredMethod(methodNamePrivateSetMyInt, int.class);
        method.setAccessible(true);
        method.invoke(myClass, intOne);
        assertEquals(intOne, myClass.getMyInt());
    }

}