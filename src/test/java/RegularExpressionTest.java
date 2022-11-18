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
    @Test
    public void mac_Adress_1correct()
    {
        assertTrue(RegularExpression.Mac_Adress("00-17-9A-10-CD-AA"));
        assertTrue(RegularExpression.Mac_Adress("00:26:57:00:1f:02"));
        assertTrue(RegularExpression.Mac_Adress("e0:db:55:d5:a9:0c"));
        assertTrue(RegularExpression.Mac_Adress("01:0C:CD:01:01:21"));
        assertTrue(RegularExpression.Mac_Adress("01-0C-CD-04-00-00"));
        assertTrue(RegularExpression.Mac_Adress("ff:ff:ff:ff:ff:ff"));
        assertFalse(RegularExpression.Mac_Adress("gg:dC:cA:56:76:54"));
        assertFalse(RegularExpression.Mac_Adress("00:26:123:00:F2:02"));
        assertFalse(RegularExpression.Mac_Adress("e0:db:55:d5:a9:nn"));
        assertFalse(RegularExpression.Mac_Adress("01:0C:CD:01:99:КК"));
        assertFalse(RegularExpression.Mac_Adress("01-zZ-CD-04-00-00"));
        assertFalse(RegularExpression.Mac_Adress("ff:ff:fh:ff:ff:ff"));
    }
}