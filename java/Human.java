public class Human {

    private String names;
    private String surname;
    private String gender;
    private int age;
    private int weigh;

    public Human (String names,String surname,int age,int weigh,String gender){
        this.age = age;
        this.names = names;
        this.surname = surname;
        this.weigh = weigh;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Human{" +
                "names='" + names + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", weigh=" + weigh +
                '}';
    }

    public String getNames() {
        return names;
    }

    public int getAge() {
        return age;
    }

    public int getWeigh() {
        return weigh;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
