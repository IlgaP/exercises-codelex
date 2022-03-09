package io.codelex.classesandobjects.practice;

public class Dog {
    private final String name;
    private final String sex;
    Dog mother;
    Dog father;

    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String fathersName(){
        if(father != null) {
            return father.name;
        } else {
            return "Unknown";
        }
    }
    public boolean hasSameMotherAs(Dog otherDog){
        return mother.equals(otherDog.mother);
    }
}
