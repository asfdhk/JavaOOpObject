public class Student extends Human{

    public Student(String names, String surname, int age, int weigh, String gender) {
        super(names, surname, age, weigh, gender);
    }

    @Override
    public String toString() {
        return "Student{" +
                "names='" + getNames() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", age=" + getAge() +
                ", weigh=" + getWeigh() +
                '}';
    }
}
