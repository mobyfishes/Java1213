package day2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> arraylist = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

    }

    private static final int x;
    static{
        x = 10;
        System.out.println("I am loading");
    }

    public void fun(int x) throws IndexOutOfBoundsException{
        int[] arr = {1, 2, 3};
        int a = arr[x];

        String s = "s";
        if (s instanceof String) System.out.println("true");
    }

    public class badNumber
    {
        public void badNumber() throws Exception
        {
            throw new IndexOutOfBoundsException();
        }

    }
}
