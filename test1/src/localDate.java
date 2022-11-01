import java.time.DayOfWeek;
import java.time.LocalDate;

public class localDate {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(2004, 7, 23);
        int year = today.getYear();
        int month = today.getDayOfMonth();
        int day = today.getMonthValue();
        DayOfWeek week = today.getDayOfWeek();
        int value = week.getValue(); // 1 -> Monday ..... 7 -> Sunday
        LocalDate aThousandsDaysLater = today.plusDays(1000);
        LocalDate aThousandsDaysBefore = today.minusDays(1000);
    }
}
