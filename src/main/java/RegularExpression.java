import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression
{
    public static boolean TimeCheck(String s)
    {
        //String Line = "Завтрак в 9:00";
        Pattern pattern = Pattern.compile("((2[0-3]|[0-1]\\d):[0-5]\\d)");
        Matcher matcher = pattern.matcher(s);
        return (matcher.find());

    }

    public static boolean Mac_Adress(String s)
    {
        //Написать регулярное выражение, определяющее является ли заданная строка правильным MAC-адресом. 
        //– пример правильных выражений: aE:dC:cA:56:76:54.
        //– пример неправильных выражений: 01:23:45:67:89:Az.
        //^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$
        Pattern pattern = Pattern.compile("^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$");
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }
}
