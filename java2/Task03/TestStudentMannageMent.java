package ADF2.Task03;

import java.util.ArrayList;
import java.util.List;

public class TestStudentMannageMent {
    public static void main(String[] args) {
        StudentManagement  management = new StudentManagement();
        management.addStudent();
        management.display();
        management.classificationStudents();
        management.avgInfo();
    }
}
