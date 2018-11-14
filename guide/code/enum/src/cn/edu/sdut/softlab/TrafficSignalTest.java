package cn.edu.sdut.softlab;

/**
 * Created by subaochen on 16-12-22.
 */
public class TrafficSignalTest {
    public static void main(String[] args) {
        TrafficSignal red = TrafficSignal.valueOf("go");
        System.out.println(red);
        for(TrafficSignal ts : TrafficSignal.values()) {
            System.out.println(ts.toString() + " means " + ts.value());
        }
    }
}
