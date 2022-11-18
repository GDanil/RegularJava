import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpressionTest
{

    @Test
    public void TimeCheck_1correct()
    {
        Assert.assertTrue(RegularExpression.TimeCheck("Завртак в 09:00"));
        Assert.assertTrue(RegularExpression.TimeCheck("Обед в 12:30."));
        Assert.assertTrue(RegularExpression.TimeCheck("В субботу на практику к 10:00."));
        Assert.assertTrue(RegularExpression.TimeCheck("В понедельник 4 пары с 10:00 до 17:15."));
        Assert.assertTrue(RegularExpression.TimeCheck("В понедельник 4 пары с 10:00 до 17:15."));
        Assert.assertTrue(RegularExpression.TimeCheck("В среду одна физра с 11:45."));

        Assert.assertFalse(RegularExpression.TimeCheck(" 37:89 "));
        Assert.assertFalse(RegularExpression.TimeCheck(" 37:89 "));
        Assert.assertFalse(RegularExpression.TimeCheck("24:00"));
        Assert.assertFalse(RegularExpression.TimeCheck("25:00"));
        Assert.assertFalse(RegularExpression.TimeCheck("33:00"));
        Assert.assertFalse(RegularExpression.TimeCheck("12:61"));
        Assert.assertFalse(RegularExpression.TimeCheck("56:12"));

    }
}