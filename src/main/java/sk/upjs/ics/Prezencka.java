package sk.upjs.ics;

import java.time.LocalDateTime;
import java.util.Set;

public record Prezencka(
        Long id,
        LocalDateTime datum,
        Predmet predmet,
        Set<Student> zoznamStudentov) {
}
