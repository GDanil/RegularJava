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
}
