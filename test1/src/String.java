public class String {
    public static void main(java.lang.String[] args){
        //对于经常要拼接的字符串，用String类型效率低，利用StringBuilder的类可以避免
        StringBuilder builder = new StringBuilder();
        builder.append("str"); //appends a string
        builder.append('a'); //apends a single character(代码单元:char)
        //调用toString 的方法，得到String 对象，包含了构建器(builder)中的字符序列
        java.lang.String completedString = builder.toString();


        //文本块
        java.lang.String prompt = """
                Hello, my name is Hal.
                Please enter your name:
                """;
        //文本块适合包含其他语言编写的代码,可将这些代码直接粘贴到一对三重引用中
        java.lang.String html = """
                <div class="Warning">
                    Beware of those who say "Hello" to the world
                </div>
                """;
        /*
        * 一般不用转义字符，一下三种情况需要转义字符
        * 1. 文本以一个引号结尾
        * 2. 文本中包含三个或多个引号组成的一个序列
        * 3. 反斜杠需要转义，\会把两行的内容连在一起
        * 4. 文本块会对结束符进行标准化，删除末尾的空白字符，并把windows的行结束符(\r\n)改为简单的(\n)。因此末尾空格需要用转义(\s)
        */
    }
}
