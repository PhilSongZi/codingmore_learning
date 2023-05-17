package top.codingmore.codingmorelogback;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/1515:03
 * @description 用来查看logback日志记录的文件位置.
 */
public class HelloWorld {

    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.home"));
    }
}
