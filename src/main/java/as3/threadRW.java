package as3;

import java.io.*;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedDeque;

public class threadRW {

    private static int readingEnd = 1;
    public static void main(String[] args) {
        ConcurrentLinkedDeque<String> stack = new ConcurrentLinkedDeque<>();
        threadWR T1 = new threadWR(stack, "write");
        threadWR T2 = new threadWR(stack, "read");
        T1.start();
        T2.start();
    }


}

class threadWR extends Thread {
    private Thread t;
    ConcurrentLinkedDeque<String> stack;
    String wr;

    public threadWR(ConcurrentLinkedDeque stack, String wr) {
        this.stack = stack;
        this.wr = wr;
    }

    public void run() {
        if (this.wr.equals("write")) {
            System.out.println("Running " + wr);

            File myObj = new File("C:\\Users\\BAOZ1\\Desktop\\Assignment4\\input.txt");
            Scanner myReader = null;
            try {
                myReader = new Scanner(myObj);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            while (myReader.hasNextLine()) {
               String data = myReader.nextLine();
               stack.add(data);
            }
            stack.add("end");
            t.interrupt();
        }

        if (this.wr.equals("read")) {
            System.out.println("Running " + wr);
            String fileName = "C:\\Users\\BAOZ1\\Desktop\\Assignment4\\output.txt";
            BufferedWriter writer = null;
            try {
                writer = new BufferedWriter(new FileWriter(fileName, true));
            } catch (IOException e) {
                e.printStackTrace();
            }
            String function;
            String[] arry;
            int ans = 0;
            while (true) {

                if (!stack.isEmpty()) {
                    function = stack.pop();
                    if (function.equals("end")){
                        try {
                            writer.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        t.interrupt();
                        break;
                    }
                    arry = function.split(" ");
                    if (arry[0].length() > 0){
                        ans = Integer.valueOf(arry[0]);
                        for (int j = 1; j < arry.length; j++){
                            if (arry[j].equals("+")){
                                ans = ans + Integer.valueOf(arry[j+1]);
                                ++j;
                            }
                            else if (arry[j].equals("-")){
                                ans = ans - Integer.valueOf(arry[j+1]);
                                ++j;
                            }
                        }
                        try {
                            writer.append(function + " = " + String.valueOf(ans) + "\n\n");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                }
            }

        }
    }

    public void start() {
        System.out.println("Starting " + wr);
        if (t == null) {
            t = new Thread(this, wr);
            t.start();
        }
    }

}
