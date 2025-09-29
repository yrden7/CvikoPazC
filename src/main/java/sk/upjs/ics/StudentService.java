package sk.upjs.ics;

import java.util.Set;

public class StudentService {
    private Set<Student> students;

    public double ratio() {
        int pocetM = 0;
        int pocetZ = 0;
        int pocetMutant = 0;
        for (Student student : students) {
            switch (student.sex()) {
                case Man -> pocetM++;
                case Woman -> pocetZ++;
                case Mutant -> pocetMutant++;
                case null, default ->{}

            }
                 /* if (student.sex() == Student.Gender.Man){
                pocetM++;
            }
            if(student.sex() == Student.Gender.Woman){
                pocetZ++;
            }
            */

        }
        PomerGenderov pm = new PomerGenderov(pocetM,pocetZ,pocetMutant);
        return pm.pomer();

    }
}
