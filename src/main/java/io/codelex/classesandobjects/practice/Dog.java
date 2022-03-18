package io.codelex.classesandobjects.practice;

public class Dog {
    private final String name;
    private final Gender gender;
    private Dog mother;
    private Dog father;

    public Dog(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public void setMother(Dog mother) {
        this.mother = mother;
    }

    public void setFather(Dog father) {
        this.father = father;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String fathersName() {
        if (father != null) {
            return father.name;
        } else {
            return "Unknown";
        }
    }

    public boolean hasSameMotherAs(Dog otherDog) {
        if (mother != null) {
            return mother.equals(otherDog.mother);
        }
        return false;
    }
}
