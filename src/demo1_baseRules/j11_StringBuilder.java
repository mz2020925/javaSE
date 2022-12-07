package demo1_baseRules;

public class j11_StringBuilder {
    public static void main(String[] args) {

        // StringBuilder构造方法
        StringBuilder sb = new StringBuilder();
        System.out.println(sb);
        System.out.println(sb.length());

        StringBuilder sb2 = new StringBuilder("hello");
        System.out.println(sb2);
        System.out.println(sb2.length());

        // StringBuilder追加和反转字符串
        StringBuilder sb3 = new StringBuilder();
        sb3.append("hello world!").append("--zmz");
        System.out.println(sb3);

        StringBuilder sb4 = new StringBuilder();
        sb4 = sb3.reverse();
        System.out.println(sb4);

        // StringBuilder与String相互转换
        StringBuilder sb5 = new StringBuilder();
        sb5.append("哈哈哈哈哈哈哈哈哈");
        String s1 = sb5.toString();
        System.out.println(s1);

        String s2 = "嘿嘿嘿嘿";
        StringBuilder sb6 = new StringBuilder(s2);
        System.out.println(sb6);


    }
    // StringBuilder将int数组转换成一个字符串
    public static String arrayToString(int[] arr){
        StringBuilder sb7 = new StringBuilder();
        sb7.append("[");

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                sb7.append(arr[i]);
            }else{
                sb7.append(arr[i]+", ");
            }
        }
        sb7.append("]");
        String s = sb7.toString();
        return s;
    }

    // StringBuilder反转字符串
    public static String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}
