package controle.estoque.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtils {
    private static final DateTimeFormatter f =
            DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static LocalDate parse(String data) {
        return LocalDate.parse(data, f);
    }

    public static String fmt(LocalDate d) {
        return d.format(f);
    }
}
