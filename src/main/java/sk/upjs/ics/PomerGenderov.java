package sk.upjs.ics;


public record PomerGenderov(int chlapci, int dievcata, int mutant) {

    public double pomerChlapcov(){
        var celkovo = chlapci + dievcata + mutant;
        return (double)(chlapci)/celkovo;
    }
    public double pomerDievcat(){
        var celkovo = chlapci + dievcata + mutant;
        return (double)(dievcata)/celkovo;
    }
    public double pomerMutan() {
        var celkovo = chlapci + dievcata + mutant;
        return (double)(mutant)/celkovo;
    }
}
