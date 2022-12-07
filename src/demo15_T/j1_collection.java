package demo15_T;

import java.util.ArrayList;
import java.util.Collection;

public class j1_collection {
    public static void main(String[] args) {
        Collection colArr = new ArrayList();

        colArr.add("zmz");
        colArr.add(100);

        System.out.println(colArr);


        Collection<String> colStr= new ArrayList<>();
        colStr.add("zmz");
        colStr.add("100");
        System.out.println(colStr);
    }
}
