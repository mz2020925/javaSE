package demo1_baseRules;

import java.util.Scanner;

public class j10_Stringclass {
    public static void main(String[] args) {
        char[] chars = {'a','b','c'};
        String s1 = new String(chars);
        String s2 = new String(chars);
        System.out.println(s1==s2);   // 这里使用双等号直接判断是判断这两个对象地址是否相同，是不相同的，
                                        // 如果使用.equals()方法比较的是对象地址指向的数据，返回的是true
        System.out.println(s1.equals(s2));

        String s3 = "abc";
        String s4 = "abc";
        System.out.println(s3==s4);

        System.out.println(s1==s3);


        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i)+" ");
        }


    }

    // 字符串拼接方法
    public static String arrayToString(int[] arr){
        String s = "";
        s += "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1){
                s += arr[i];
            }
            else{
                s += arr[i];
                s += ", ";
            }
        }
        s += "]";
        return s;
    }
    // 字符串反转方法
    public static String reverse(String s){
        String ss = "";
        for (int i = s.length()-1; i >= 0; i--) {
            ss += s.charAt(i);
        }
        return ss;
    }

}
