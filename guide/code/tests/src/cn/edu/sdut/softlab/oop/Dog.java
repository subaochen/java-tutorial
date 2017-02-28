package cn.edu.sdut.softlab.oop;

/**
 * Class Dog
 */
public class Dog implements PeopleHelper, MouseKiller {

    protected String color;

    public Dog() {
    }


    /**
     * Set the value of color
     *
     * @param newVar the new value of color
     */
    protected void setColor(String newVar) {
        color = newVar;
    }

    /**
     * Get the value of color
     *
     * @return the value of color
     */
    protected String getColor() {
        return color;
    }

    /**
     * 和人类一起玩耍
     */
    public void playWithPeople() {
    }

    /**
     * 杀死耗子
     */
    public void killMouse() {
    }

    /**
     * 打猎
     */
    protected void hunt() {
    }
}
