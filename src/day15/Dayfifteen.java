package day15;

import java.util.Objects;

public class Dayfifteen {
    public String name;
    public int rollNumber;
    public int studentClass;
    public Dayfifteen(String name, int rollNumber, int studentClass ){
        this.name=name;
        this.rollNumber=rollNumber;
        this.studentClass=studentClass;
    }

    @Override
    public String toString() {
        return "Dayfifteen{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", studentClass=" + studentClass +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dayfifteen that = (Dayfifteen) o;
        return rollNumber == that.rollNumber && studentClass == that.studentClass && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNumber, studentClass);
    }
}
