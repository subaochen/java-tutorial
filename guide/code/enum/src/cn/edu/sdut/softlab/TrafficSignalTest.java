package cn.edu.sdut.softlab;

/**
 * Created by subaochen on 16-12-22.
 */
public class TrafficSignalTest {
    public static void main(String[] args) {
        for(TrafficSignal ts : TrafficSignal.values()) {
            System.out.println(ts.toString() + " means " + ts.value());
        }
    }
}
