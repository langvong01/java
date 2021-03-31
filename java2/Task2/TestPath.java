package ADF2.Task2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPath {
    public static void main(String[] args) {
       //Pattern
        String str;
        String strPattern = "[A-Z]:(\\\\\\w+)+([a-z]+)\\.[a-z]+";
        Pattern pattern = Pattern.compile(strPattern);
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input Path");
        str = sc.nextLine();
        Matcher matcher = pattern.matcher(str);
        if (matcher.matches()) {
            System.out.println("Chuoi dung dinh dang !");

            AnalysisPathProgram p1 = new AnalysisPathProgram();
            //Exception
            try {
                p1.inputPath(str);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            //Test
            try{
                System.out.println("Disk: " + p1.getDisk(p1));
                System.out.println("Path: " + p1.getPath(p1));
                System.out.println("Folder: " +p1.getFolder(p1));
                System.out.println("File name: " + p1.getFileName(p1).trim());
                System.out.println("Extension: "+ p1.getExtension(p1));

            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Chuoi nhap vao ko dung dinh dang");
        }


    }
}