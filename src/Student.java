public class Student {

    String firstName;
    String lastName;
    int age;
    int height;
    boolean gender;

    public Student (String firstName, String lastName, int age, int height, boolean gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.gender = gender;
    }



    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", gender=" + gender +
                '}';
    }
}
