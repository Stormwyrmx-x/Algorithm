import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class Test
{
    public static void main(String[] args)
    {
        String fuck="aaa";
        String fuck2="aaa";
        System.out.println(fuck2==fuck);
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);
//        System.out.println(LocalDateTime.now());
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime of = LocalDateTime.of(2002, 2, 22,1,1,1);
        System.out.println(now.getDayOfWeek());

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.of(1,1,1));

    }
}
