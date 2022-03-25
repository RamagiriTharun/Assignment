import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class ClassAssignment4 {
    public static void main(String[] args) {
        try {
            File file = new File("F:\\CAPG\\Assignments\\src\\Test.txt");
            FileInputStream fin = new FileInputStream(file);
            StringBuffer buffer = new StringBuffer();
            Scanner sc = new Scanner(fin);
            while(sc.hasNext()) {
                buffer.append(" "+sc.nextLine());
            }
            System.out.println("Contents of the file: "+buffer);
            fin.close();
            File dest = new File("F:\\CAPG\\Assignments\\src\\Dest.txt");
            FileWriter writer = new FileWriter(dest);
            writer.write(buffer.toString());
            writer.flush();
            System.out.println("file copied successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
