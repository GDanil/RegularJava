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
    @Test
    public void e_mail_correct()
    {
        assertTrue(RegularExpression.E_mail("alex@yandex.ru"));
        assertTrue(RegularExpression.E_mail("user@example.com"));
        assertTrue(RegularExpression.E_mail("root@localhost"));
        assertTrue(RegularExpression.E_mail("makarov.petya@mail.ru"));
        assertTrue(RegularExpression.E_mail("natalya@mail.ru"));
        assertTrue(RegularExpression.E_mail("Dima@mail.ru"));

        assertFalse(RegularExpression.E_mail("Abc.example.com"));
        assertFalse(RegularExpression.E_mail("A@b@example.com"));
        assertFalse(RegularExpression.E_mail("just\"not\"right@example.com"));
        assertFalse(RegularExpression.E_mail("this is\"not\\allowed@example.com"));
        assertFalse(RegularExpression.E_mail("QA[icon]CHOCOLATE[icon]@test.com"));
        assertFalse(RegularExpression.E_mail("i_like_underscore@but_its_not_allowed_in_this_part.example.com"));
    }
    @Test
    public void correct_password()
    {
        assertTrue(RegularExpression.Correct_password("C00l_Pass"));
        assertTrue(RegularExpression.Correct_password("SupperPas1"));
        assertTrue(RegularExpression.Correct_password("Its3Weird"));
        assertTrue(RegularExpression.Correct_password("To_Check1"));
        assertTrue(RegularExpression.Correct_password("_SoMan7y"));
        assertTrue(RegularExpression.Correct_password("_te_S_t_s777"));

        assertFalse(RegularExpression.Correct_password("Cool_pass"));
        assertFalse(RegularExpression.Correct_password("C00l"));
        assertFalse(RegularExpression.Correct_password("Not_8"));
        assertFalse(RegularExpression.Correct_password("_te_s_t_s777"));
        assertFalse(RegularExpression.Correct_password("123456789"));
        assertFalse(RegularExpression.Correct_password("____________"));
    }
}