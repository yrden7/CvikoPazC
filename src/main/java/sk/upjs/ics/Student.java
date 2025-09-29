package sk.upjs.ics;

import lombok.With;

import java.time.LocalDate;


@With
public record Student(
        long ID,
        String meno,
        Gender sex,
        String priezvisko,
        LocalDate datumNarodenia

) {
    public enum Gender {
        Woman, Mutant, Man

    }
}
