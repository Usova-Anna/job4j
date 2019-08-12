package ru.job4j.oop;

public class Doctor extends Profession {
    public String clinic;
    public boolean studiedAbroad;

    public Doctor() {
        super();
    }

    public Diagnose treat(Patient patient) {
        //ставит диагноз каждому пациенту
        return new Diagnose();
    }

    public Document examine(Patient patient) {
        //осматривает. Результат осмотра - даёт заключение/направление, например на анализы
        return new Document();
    }
}
