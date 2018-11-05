package cn.edu.sdut.softlab.essentials.string;

public class StringBufferTest {
    public static void main(String[] args) {
        int loops = 5000;
        System.out.println(System.currentTimeMillis());
        String s = "";
        for(int i = 0; i < loops; i++)
            s = s + i;
        System.out.println(System.currentTimeMillis());
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < loops; i++)
            sb.append(i);
        System.out.println(System.currentTimeMillis());
    }

}
