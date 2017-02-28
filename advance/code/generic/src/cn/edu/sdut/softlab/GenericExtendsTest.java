package cn.edu.sdut.softlab;

/**
 * Created by subaochen on 16-12-27.
 */
public class GenericExtendsTest {
    public static <T> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray)
            //if (e > elem)  //|\longremark{语法错误，">"只能用于简单数据类型，类型参数不允许是简单数据类型，因此这里不能直接使用">"}|
                ++count;
        return count;
    }
} //|\showremarks|
