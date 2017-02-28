package cn.edu.sdut.softlab.oopm.multiinterface;

/**
 * 更符合逻辑的SmartPrinter类.
 *
 * @author Su Baochen
 */
public class BetterSmartPrinter {

  public void print() {
    new MultiPrinter().print();
  }

  public void copy() {
    new MultiCopier().copy();
  }

  class MultiPrinter implements Printer {

    @Override
    public void print() {
      System.out.println("multiPrinter print");
    }

  }

  class MultiCopier implements Copier {

    @Override
    public void copy() {
      System.out.println("multiCopier copy");
    }

  }
}
