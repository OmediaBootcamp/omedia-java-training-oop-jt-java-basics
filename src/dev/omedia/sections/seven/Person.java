package dev.omedia.sections.seven;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public boolean isTeen() {
        return this.getAge() > 12 && this.getAge() < 20;
    }

    public String getFullName() {
        return this.getFirstName()
                + (this.getFirstName().isEmpty() || this.getLastName().isEmpty() ? "" : " ")
                + this.getLastName();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age < 0 || age > 100 ? 0 : age;
    }
}
