package controle.estoque.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {
    public static LocalDateTime parse(String data) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDateTime.parse(data, f);
    }

    public static String fmt(LocalDateTime d) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return d.format(f);
    }
}