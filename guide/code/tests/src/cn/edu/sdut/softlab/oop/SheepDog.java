package cn.edu.sdut.softlab.oop;

/**
 * Class SheepDog
 */
public class SheepDog implements PeopleHelper {

    /**
     * 主人
     */
    private String owner;

    public SheepDog() {
    }

    /**
     * Set the value of owner
     * @param newVar the new value of owner
     */
    private void setOwner(String newVar) {
        owner = newVar;
    }

    /**
     * Get the value of owner
     * @return the value of owner
     */
    private String getOwner() {
        return owner;
    }

    /**
     * 看护，守望羊群
     */
    public void watch() {
    }

    /**
     * 和人类一起玩耍
     */
    public void playWithPeople() {
    }
}
