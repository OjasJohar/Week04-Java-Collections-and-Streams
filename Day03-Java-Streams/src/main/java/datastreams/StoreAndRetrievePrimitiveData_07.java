package datastreams;
import java.io.*;

public class StoreAndRetrievePrimitiveData_07 {
    private static final String fileName = "students.dat";

    public static void saveStudent(int roll, String name, double gpa) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            dos.writeInt(roll);
            dos.writeUTF(name);
            dos.writeDouble(gpa);
            System.out.println("Student data saved.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readStudent() {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            System.out.println("Roll: " + dis.readInt());
            System.out.println("Name: " + dis.readUTF());
            System.out.println("GPA: " + dis.readDouble());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        saveStudent(101, "OJAS", 9.8);
        readStudent();
    }
}
