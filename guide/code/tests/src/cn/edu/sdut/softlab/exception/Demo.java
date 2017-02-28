package cn.edu.sdut.softlab.exception;

/**
 * Created by subaochen on 17-2-20.
 */
public class Demo {
    public void test() throws MyException {
        if (true)
            throw new MyException("发生了异常，请及时处理");
    }
}
