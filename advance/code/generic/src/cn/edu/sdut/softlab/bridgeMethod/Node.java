package cn.edu.sdut.softlab.bridgeMethod;

/**
 * Created by subaochen on 17-1-15.
 */
public class Node<T> {
    public T data;
    public Node(T data) { this.data = data; }

    public void setData(T data) {
        System.out.println("Node.setData");
        this.data = data;
    }
}
