package cn.edu.sdut.softlab;

/**
 * Created by subaochen on 16-12-22.
 */
public enum TrafficSignal {
    RED("stop"),GREEN("go"),YELLOW("ready");

    private String value;
    public String value() {
        return this.value;
    }

    TrafficSignal(String value) {
        this.value = value;
    }
}
