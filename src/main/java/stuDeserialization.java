import java.io.*;

public class stuDeserialization {

    public static void main(String[] args){
        Student student = null;
        try(
                InputStream fileIn = new FileInputStream("C:\\Users\\BAOZ1\\Desktop\\Core_Java\\student.ser");
                ObjectInputStream in = new ObjectInputStream(fileIn);
                )
        {
            student = (Student) in.readObject();
            System.out.println(student.getName());
        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }

    }

}
