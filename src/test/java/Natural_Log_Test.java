import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Natural_Log_Test {
    @BeforeClass
    public static void before_test() {
        System.out.println("===============================================");

        System.out.println("starting log test");
        System.out.println("===============================================");
    }


    @Test
    public void positive_float() {
        Calculator mycalc = new Calculator();
        System.out.println("test 1) log +ve");
        assertEquals("log 10 not working correctly",2.3025851,mycalc.nat_log(10),0.00001);
    }

    @Test
    public void negative_float() {
        Calculator mycalc = new Calculator();
        System.out.println("test 2) log -ve");
        assertEquals("log -10 not working correctly",-1,mycalc.nat_log(-6),0.00001);
    }
}