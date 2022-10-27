import java.util.*;
import java.lang.String;

public class InputOutput {
    public static void main(String[] args) {
        //读取输入
        //1. 构造与"标准输入流"System.in关联的Scanner对象
        Scanner in = new Scanner(System.in);
        System.out.println("What your name?");
        String name = in.nextLine();//读取一行数据
        String firstName = in.next(); //读取一个单词，空格作为分隔符
        System.out.println("How old are you?");
        int age = in.nextInt(); //读取一个整数
        double grade = in.nextDouble(); //读取一个双精度数
        
    }
}
