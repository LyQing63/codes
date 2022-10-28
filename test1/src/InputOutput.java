import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.*;
import java.lang.String;

public class InputOutput {
    public static void main(String[] args) throws IOException {
        //读取输入
        //1. 构造与"标准输入流"System.in关联的Scanner对象
        Scanner in = new Scanner(System.in);
        System.out.println("What your name?");
        String name = in.nextLine();//读取一行数据
        String firstName = in.next(); //读取一个单词，空格作为分隔符
        System.out.println("How old are you?");
        int age = in.nextInt(); //读取一个整数
        double grade = in.nextDouble(); //读取一个双精度数
        //因为输入所有人可见，Scanner类不适用于密码输入，用Console类
        Console cons = System.console(); //在idea中由于JVM不是在交互式命令行中cons会被判断为空，报错。
        String username = cons.readLine("User name:");
        char[] passwd  = cons.readPassword("Password:"); //为安全起见，用char数组存放密码，对密码处理之后需要用一个填充覆盖数组元素
        //console类处理输入不如scanner，只能一次输入一行，且没有提供方法来读取单个单词或数字。
        //打印输出
        //1. 用String format方法构建格式化字符串
        String message = String.format("Hello, %s. Next year, you'll be %d", name, age+1);
        //也可以写为String message = "Hello, %s. Next year, you'll be %d".formatted(name, age+1);少写五个字符
        //文件读取
        Scanner in_2 = new Scanner(Path.of("myLife.txt"), StandardCharsets.UTF_8);//文件包含反斜杠需要用双斜杠转义 ->"C:\\myDirectory\\myLife.txt"
        //文件写
        // 要构造PrintWrite对象
        PrintWriter out = new PrintWriter("myLife.txt",StandardCharsets.UTF_8);//如果文件不存在，则创建该文件
        //一个不存在的文件构造Scanner或者无法创建的文件名构造一个PrintWriter会产生异常

    }

}
