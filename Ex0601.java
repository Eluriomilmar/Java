import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


public class Ex0601 {

    public static void main(String[] args) {

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d1 = LocalDate.now();
        LocalDateTime d2 = LocalDateTime.now();
        Instant d3 = Instant.now();
        LocalDateTime d4 = LocalDateTime.parse("2025-02-02T01:30:26");
        Instant d5 = Instant.parse("2025-02-02T01:30:26Z");
        LocalDate d6 = LocalDate.parse("02/02/2026", f1);
        LocalDateTime d7 = LocalDateTime.parse("02/02/2026 17:45", f2);
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        LocalDate d8 = LocalDate.of(2026, 2, 2);

        LocalDateTime d9 = LocalDateTime.of(2026, 2, 2, 17, 49);




        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(fmt1.format(d5));
        System.out.println(d6);
        System.out.println(d7);
        System.out.println(d8);
        System.out.println(d9);

    }
}
