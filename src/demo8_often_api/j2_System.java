package demo8_often_api;

public class j2_System {
    public static void main(String[] args) {
        // 2.System包中的currentTimeMillis()和exit()方法
        System.out.println(System.currentTimeMillis());  // 当前毫秒值
        System.out.println(System.nanoTime());  // 返回正在运行的java虚拟机的高分辨率时间源的当前值，不是系统时间

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            System.out.println();
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);

        System.exit(0);  // 终止当前运行的java虚拟机，并告诉用户是以0状态码（即正常状态）终止，若给定非零参数，则表示异常终止

    }
}
