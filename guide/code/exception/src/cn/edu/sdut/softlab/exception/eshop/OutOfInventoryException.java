package cn.edu.sdut.softlab.exception.eshop;

/**
 * 库存不足异常类.
 *
 * @author Su Baochen
 */
public class OutOfInventoryException extends Exception {

	public OutOfInventoryException(String message) {
		super(message);
	}
}
