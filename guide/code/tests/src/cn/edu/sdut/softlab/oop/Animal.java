package cn.edu.sdut.softlab.oop;

/**
 * Class Animal
 */
abstract public class Animal {

    protected String name;
    protected float weight;
    protected float height;
    protected String category;

    public Animal() {
    }

    ;


    /**
     * Set the value of name
     *
     * @param newVar the new value of name
     */
    protected void setName(String newVar) {
        name = newVar;
    }

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    protected String getName() {
        return name;
    }

    /**
     * Set the value of weight
     *
     * @param newVar the new value of weight
     */
    protected void setWeight(float newVar) {
        weight = newVar;
    }

    /**
     * Get the value of weight
     *
     * @return the value of weight
     */
    protected float getWeight() {
        return weight;
    }

    /**
     * Set the value of height
     *
     * @param newVar the new value of height
     */
    protected void setHeight(float newVar) {
        height = newVar;
    }

    /**
     * Get the value of height
     *
     * @return the value of height
     */
    protected float getHeight() {
        return height;
    }

    /**
     * Set the value of category
     *
     * @param newVar the new value of category
     */
    protected void setCategory(String newVar) {
        category = newVar;
    }

    /**
     * Get the value of category
     *
     * @return the value of category
     */
    protected String getCategory() {
        return category;
    }

    /**
     * 奔跑
     */
    abstract public void run();


    /**
     * 问候
     *
     * @return String
     */
    abstract public String sayHello();


}
