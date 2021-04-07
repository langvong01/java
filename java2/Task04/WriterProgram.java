package ADF2.Task04;

import java.io.*;
import java.util.Scanner;

public class WriterProgram {
    private String path;
    private String content;

    public WriterProgram() {
    }

    public String getContent() {
        return content;
    }

    public WriterProgram(String path, String content) {
        this.path = path;
        this.content = content;
    }

    public void writeFile() {
        Scanner sc = new Scanner(System.in);
        String ans;
        System.out.println("Do you want  write file ( Y/N or y/n)");
        ans = sc.nextLine();

        if (ans.equalsIgnoreCase("Y")) {
            System.out.print("Please input path file : ");
            this.path = sc.nextLine();

            System.out.print("Please input content file :");
            this.content = sc.nextLine();

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
                System.out.println("Content input here : " + this.content);
                writer.write(this.content);
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } else {
            System.exit(0);
        }
    }


    public String getPath() {
        return path;
    }

    public void fileReader() {
        if (path != null) {
            try {
                Scanner sc = new Scanner(System.in);
                String ans;
                System.out.println("Do you want  reader file ( Y/N or y/n)");
                ans = sc.nextLine();
                if (ans.equalsIgnoreCase("Y")) {
                    System.out.print("Please input path file: ");
                    String another = sc.nextLine();

                    if (another.equalsIgnoreCase(path)) {
                        BufferedReader reader = new BufferedReader(new FileReader(getPath()));
                        int ch;
                        System.out.println("Content in file:");

                        while ((ch = reader.read()) != -1) {
                            System.out.print((char) ch);
                        }
                        System.out.println();
                        System.out.println("Read file is success");
                    } else {
                        System.out.println("Cannot reader ! Đường dẫn file ko trùng khớp !");
                    }
                } else
                    System.exit(0);
            } catch (IOException e) {
                System.out.println("Error:" + e.getMessage());
            }
        }
    }
    @Override
    public String toString() {
        return "WriterProgram{" +
                "path='" + path + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
