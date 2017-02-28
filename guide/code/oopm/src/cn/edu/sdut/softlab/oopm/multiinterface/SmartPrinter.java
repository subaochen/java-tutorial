package cn.edu.sdut.softlab.oopm.multiinterface;

/**
 * 智能打印机类.
 *
 * @author Su Baochen
 */
public class SmartPrinter implements Printer, Copier {

  @Override
  public void print() {
    System.out.println("print called");
  }

  @Override
  public void copy() {
    System.out.println("copy called");
  }

}
