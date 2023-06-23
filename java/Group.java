import java.io.*;

public class Group {

    private String groupName;
    private Student[] students= new Student[10];
    private File file;

    public Group(String groupName){
        this.groupName = groupName;
    }

    public void aadStudent(Student student){
        int a = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                a++;
            }
        }
        if (a==0){
            System.out.println("Гупа заповнена ");
        }else {
            int n = students.length - a;
            students[n] = student;
            System.out.println("Студента " + student + " додано до групи " + groupName);
        }
    }

    public void createFile()  {
        String name = groupName;
        file = new File(name+".txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            for (int i =0;i<students.length;i++){
                if (students[i] != null){
                    fileWriter.write(this.students[i].toString()+ "\n");
                }
            }
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void readFile()  {
        System.out.println(groupName+":");
        String line = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null ){
                System.out.println(line);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public String getGroupName() {
        return groupName;
    }

    public Student[] getStudents() {
        return students;
    }

    public File getFile() {
        return file;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
