import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{
    public static void main(String[] args)
    {
        t1();
        t2();
    }

    public static void t1()
    {
        Pattern pattern = Pattern.compile(",");
        // Split input with the pattern

        String[] result = pattern.split("one,two, three   four ,    five");
        for (String s : result) System.out.println(s);
    }

    public static void t2()
    {
        List<String> emails = new ArrayList<>();
        emails.add("user@domain.com");
        emails.add("user@domain.co.in");
        emails.add("user1@domain.com");
        emails.add("user.name@domain.com");
        emails.add("user#@domain.co.in");
        emails.add("user@domaincom");

//Invalid emails
        emails.add("user#domain.com");
        emails.add("@yahoo.com");


        Pattern pattern = Pattern.compile("@domain");

        for(String email : emails){
            Matcher matcher = pattern.matcher(email);
            System.out.println(email +" : "+ matcher.find());
        }
    }
}