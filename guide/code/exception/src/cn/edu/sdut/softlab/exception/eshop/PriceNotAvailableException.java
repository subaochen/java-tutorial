package cn.edu.sdut.softlab.exception.eshop;

/**
 * 价格已变更异常类.
 *
 * @author Su Baochen
 */
public class PriceNotAvailableException extends Exception {

	public PriceNotAvailableException(String message) {
		super(message);
	}
}
