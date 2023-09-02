package LearningDateTime;
import java.time.*;
import java.time.format.*;

public class DateAndTime {
    //LocalDate, LocalTime, LocalDateTime are IMMUTABLE!!!
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_DATE;
        LocalDate ld = LocalDate.of(2000, 6, 1);
        LocalDateTime ldt = LocalDateTime.of(2000, 6, 1, 18, 0, 30, 500000);
        DateTimeFormatter _dtf = DateTimeFormatter.ISO_LOCAL_TIME;
        LocalTime lt = LocalTime.of(21, 45, 15, 5000000);


        System.out.println(ld.format(dtf));
        System.out.println(ld.format(DateTimeFormatter.ISO_ORDINAL_DATE));
        System.out.println(ldt.format(dtf));
        System.out.println(LocalTime.of(15, 30, 0).format(_dtf));

        System.out.println("____________________________");

        System.out.println("---ofLocalizedDate---");
        DateTimeFormatter shortDTF = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter mediumDTF = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter longDTF = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        DateTimeFormatter fullDTF = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);

        System.out.println(ld.format(shortDTF));
        System.out.println(ld.format(mediumDTF));
        System.out.println(ld.format(longDTF));
        System.out.println(ld.format(fullDTF));

        System.out.println("---ofLocalizedTime---");
        DateTimeFormatter _shortDTF = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        DateTimeFormatter _mediumDTF = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);

        System.out.println(lt.format(_shortDTF));
        System.out.println(lt.format(_mediumDTF));

        System.out.println("---ofLocalizedDateTime---");
        DateTimeFormatter __shortDTF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter __mediumDTF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

        System.out.println(ldt.format(__shortDTF));
        System.out.println(ldt.format(__mediumDTF));
        System.out.println(__mediumDTF.format(ldt));

        System.out.println("---ofPattern---");
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("HH:mm, d MMMM, yyyy г.");
        System.out.println(myFormat.format(ldt));

        System.out.println("---StringParse---");
        LocalDateTime stringTest = LocalDateTime.parse("12:30, 17 августа, 2001 г.", myFormat);
        System.out.println(stringTest);


    }
}
