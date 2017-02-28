package cn.edu.sdut.softlab;

/**
 * Created by subaochen on 16-12-25.
 */
public class IntGenerator implements Generator<Integer> {
    private static int start = 100;
    @Override
    public Integer next() {
        return start++;
    }
}
