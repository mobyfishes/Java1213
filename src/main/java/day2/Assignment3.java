package day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment3 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Map<String, String> map = new HashMap<String, String>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(10);

        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "10");

        List<Integer> ans = new ArrayList<>();

        for (Integer i : list){
            if (!map.containsValue(String.valueOf(i))){
                ans.add(i);
            }
        }

        System.out.println(ans.toString());
    }

}
