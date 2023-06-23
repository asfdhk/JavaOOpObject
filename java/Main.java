public class Main {
    public static void main(String[] args) {
        Student a = new Student("wdc","wqd",13,123,"ed");
        Student b = new Student("wdc","wqd",13,123,"ed");
        Student v = new Student("wdc","wqd",13,123,"ed");
        Group  df = new Group("dsf");
        df.aadStudent(a);
        df.aadStudent(v);
        df.aadStudent(b);
        df.createFile();
        df.readFile();

    }
}
