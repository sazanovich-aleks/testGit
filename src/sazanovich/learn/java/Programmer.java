package sazanovich.learn.java;

/**
 * Created by alex on 10.04.2016.
 */
public class Programmer extends Person implements StartJob{

    String professia;

    public Programmer(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Programmer that = (Programmer) o;

        return professia != null ? professia.equals(that.professia) : that.professia == null;

    }

    @Override
    public int hashCode() {
        return professia != null ? professia.hashCode() : 0;
    }

    public String getProfessia() {

        return professia;
    }

    public void setProfessia(String professia) {
        this.professia = professia;
    }

    @Override
    public void startWorkingDay() {

    }
}
