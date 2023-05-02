package Program;

import java.util.ArrayList;

public class Calculator {
    private ArrayList<Student> students = new ArrayList<>();

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void addAccount(Student accountAdded){
        this.students.add(accountAdded);
    }
}
