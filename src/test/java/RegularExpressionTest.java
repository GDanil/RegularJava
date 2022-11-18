import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpressionTest {

    @Test
    public void TimeCheck_1correct()
    {
        Assert.assertTrue(RegularExpression.TimeCheck("Завртак в 09:00"));
    }
}