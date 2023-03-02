

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Factorial_Test {
    @BeforeClass
    public static void before_test() {
        System.out.println("===============================================");

        System.out.println("starting factorial test");
        System.out.println("===============================================");
    }


    @Test
    public void positive_float() {
        Calculator mycalc = new Calculator();
        System.out.println("test 1) factorial +ve");
        assertEquals("factorial 5 not working correctly",120,mycalc.factorial(5),0.00001);
    }

    @Test
    public void negative_float() {
        Calculator mycalc = new Calculator();
        System.out.println("test 2) factorial -ve");
        assertEquals("factorial -5 not working correctly",-1,mycalc.factorial(-6),0.00001);
    }
}