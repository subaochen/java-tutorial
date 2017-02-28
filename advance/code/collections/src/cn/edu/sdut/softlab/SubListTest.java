package cn.edu.sdut.softlab;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by subaochen on 17-1-23.
 */
public class SubListTest {
    public static void main(String args[]) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        //
        //
        List<Integer> subList = list.subList(1, 6);//|\longremark{注意到subList的起点是从0开始计算的，因此(1,6)应该打印出2-6。}|
        System.out.println(subList);

        subList.add(10); //|\longremark{操作subList后，可以看到在原list的数据也发生了改变，也就是说，subList是list的一个视图。}|
        System.out.println(list);

        list.add(3,20); // |\longremark{但是，如果修改了原list，则subList就变得不可用，除非重新执行subList操作。也就是说，subList作为List的视图是一个单向的关系，修改subList的内容可以反映到list中，但是修改list无法反映到subList中。}|
        //System.out.println(subList);

        // 下面的代码抛出异常：起点不能大于终点
        System.out.println("----");
        list.subList(6, 5);
    }
} //|\showremarks|
