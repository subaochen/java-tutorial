package cn.edu.sdut.softlab.exception;

public class DivTestCLike {
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("请提供2个参数!");
            return;
        }

        if(args[1].equalsIgnoreCase("0")){
            System.out.println("除数不能为0!");
            return;
        }

        // 判断args[0]和args[1]是整数形式的字符串
        if(!isIntegerStr(args[0]) || !isIntegerStr(args[1])) {
            System.out.println("两个参数的格式不合法,无法转换为整数");
            return;
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("a/b = " +  a/b);
    }

    private static boolean isIntegerStr(String arg) {
        // TBD
        return true;
    }
}
