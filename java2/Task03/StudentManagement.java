package ADF2.Task03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class StudentManagement {
        private List<Student> students = null;
        public StudentManagement(){
            this.students = new ArrayList<>();
        }
        public void  addStudent(){
            Scanner sc = new Scanner(System.in);
            while (true){
                System.out.print("Name:");
                String name = sc.nextLine();

                System.out.print("Classes: ");
                String classes =sc.nextLine();
                double maths = -1,physic = -1,chemistry = -1;
                do {
                    try {
                        System.out.print("Math:");
                        maths = Double.parseDouble(sc.nextLine());
                        if(maths>10)
                            throw new Exception("Math is less than equal ten");

                        if(maths<0)
                            throw new Exception("Math is greater than equal zero");

                    }catch (Exception ex){
                        System.out.println("Error: " + ex.getMessage());
                    }
                } while (maths < 0 || maths > 10);

                do {
                    try {
                        System.out.print("Physic :");
                        physic = Double.parseDouble(sc.nextLine());
                        if(physic>10)
                            throw new Exception("Physic is less than equal ten");

                        if(physic<0)
                            throw new Exception("Physic is greater than equal zero");

                    }catch (Exception ex){
                        System.out.println("Error:" + ex.getMessage());
                    }
                }while (physic< 0 || physic > 10);
                do {
                    try {
                        System.out.print("Chemistry:");
                        chemistry = Double.parseDouble(sc.nextLine());
                        if(chemistry>10)
                            throw new Exception("Chemistry is less than equal ten");

                        if(chemistry<0)
                            throw new Exception("Chemistry is greater than equal zero");
                    }catch (Exception ex){
                        System.out.println("Error:"+ ex.getMessage());
                    }
                }while (chemistry<0 || chemistry>10);
                students.add(new Student(name, classes,maths,chemistry,physic));

            System.out.println("Do you want to enter more student infomation ? (Y/N)");
            String anwser = sc.nextLine();
            if (anwser.equalsIgnoreCase("N")){
                break;
                }else
                    continue;
            }
         }
        public void  display(){
            if (students.size()>0){
                System.out.println("----------Student List-------------");
                for (var student: students){
                    System.out.println("Name:"+student.getName());
                    System.out.println("Class:"+student.getClasses());
                    System.out.println("Average:"+ student.getAverage());
                    System.out.println("Type:" + student.getType());
                    System.out.println();
                }
            }else
                System.out.println("No student in the list");
        }

        public  void classificationStudents(){
            System.out.println("----------------------------------Classification Info-------------------------");
            if (students.size()>0){
                int typeA = 0,  typeB = 0 , typeC = 0,typeD =0;
                for (var student:students){
                    if (student.getType().contains("A")){
                        typeA++;
                    }
                    if (student.getType().contains("B")){
                        typeB++;
                    }
                    if (student.getType().contains("C")){
                        typeC++;
                    }
                    if (student.getType().contains("D")){
                        typeD++;
                    }
                }
                int totalStudents = students.size();
                System.out.println("A: " + (typeA *1.0/totalStudents)*100+" %");
                System.out.println("B: "+ (typeB *1.0/totalStudents)*100+" %");
                System.out.println("C: "+ (typeC *1.0/totalStudents)*100+" %");
                System.out.println("D: "+ (typeD *1.0/totalStudents)*100+" %");

            }else {
                System.out.println("No students");
            }
        }
        public void avgInfo(){
            System.out.println("-----------Avg Info----------");
            if (students.size()>0){
                double max = 0,min =11;
                for (var student : students){
                        if (student.getAverage() >= max)
                            max = student.getAverage();
                        if (student.getAverage()<=min)
                            min = student.getAverage();
                    }
                System.out.println("AVG max : " + max);
                System.out.println("Avg min : " + min);
                }
            }
        }
