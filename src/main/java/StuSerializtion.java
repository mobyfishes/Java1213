import java.io.*;

public class StuSerializtion
{
    public static void main(String[] args){
        Student s1 = new Student("ABI", 12, 123123);

        try{
            OutputStream fileout = new FileOutputStream("C:\\Users\\BAOZ1\\Desktop\\Core_Java\\student.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileout);

            out.writeObject(s1);
            out.close();
            fileout.close();
        } catch(IOException ex){
            ex.printStackTrace();
        }

    }

}
