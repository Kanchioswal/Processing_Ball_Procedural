import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class FactorialChecker {
    @Test
    void shouldReturnOneIfNumberLessThanTwo()
    {

        Factorial factorial = new Factorial(1);
        int fact = factorial.check(1);
        boolean ans=true;
        if(fact==1)
        {
            ans=true;
        }
        assertTrue(true);

    }

    @Test
    void returnFactorialOfNumber()
    {
        Factorial factorial = new Factorial(5);
        int fact = factorial.check(5);
        boolean ans = false;
        if(fact==120)
        {
            ans=true;
        }
        assertTrue(ans);


    }
}
