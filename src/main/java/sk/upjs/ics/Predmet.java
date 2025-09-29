package sk.upjs.ics;

import lombok.With;

import java.util.Set;

@With
public record Predmet
        (Long id,
        String name,
        int yearsOfStudies,
        Set<Student> students)
{

}
