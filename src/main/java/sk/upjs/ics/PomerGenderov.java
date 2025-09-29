package sk.upjs.ics;


public record PomerGenderov(int chlapci, int dievcata, int mutant) {

    public double pomer(){
        var celkovo = chlapci + dievcata + mutant;
        return (double)(chlapci)/dievcata;
    }
}
