package cn.edu.sdut.softlab;


import static cn.edu.sdut.softlab.TrafficSignal.GREEN;

/**
 * Created by subaochen on 16-12-22.
 */
public class EnumInSwitchTest {
    public static void main(String[] args) {
        TrafficSignal ts = GREEN;//|\longremark{如果这里写为：TrafficSignal ts = GREEN，则需要静态导入GREEN的定义。尝试修改一下看看}|
        switch(ts) {
            case GREEN: // |\longremark{因为switch的参数是enum类型的，java可以推断出这里的GREEN是TrafficSignal.GREEN}|
                System.out.println("green signal");
                break;
            case RED:
                System.out.println("red signal");
                break;
            case YELLOW:
                System.out.println("yellow signal");
                break;
        }
    }
} //|\showremarks|
