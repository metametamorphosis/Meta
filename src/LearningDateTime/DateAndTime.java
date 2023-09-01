package LearningDateTime;
import java.time.*;

public class DateAndTime {
    //LocalDate, LocalTime, LocalDateTime are IMMUTABLE!!!
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2023, Month.SEPTEMBER, 1); // (2023, 9, 1)
        System.out.printf("Local Date: %s\n", ld);

        LocalTime lt = LocalTime.of(1, 59, 59, 999999999);
        System.out.printf("Local Time: %s\n", lt);

        LocalDateTime ldt = LocalDateTime.of(ld, lt);
        System.out.printf("Local DateTime: %s\n", ldt);

        System.out.println("___");
        System.out.println("LearningPlusMinus");

        ldt = ldt.plusNanos(1).minusMonths(8).minusMonths(36);
        System.out.printf("Local DateTime: %s\n", ldt);

        System.out.println("___");

        //isAfter, isBefore (equals same type objects)
        System.out.println("LearningPeriod");
        LocalDate periodStart = LocalDate.of(2000, Month.SEPTEMBER, 1);
        LocalDate periodEnd = LocalDate.of(2007, Month.SEPTEMBER, 1);
        Period period = Period.of(1, 8, 15);
        while (periodStart.isBefore(periodEnd)) {
            System.out.println(periodStart);
            periodStart = periodStart.plus(period);
        }

    }
}
