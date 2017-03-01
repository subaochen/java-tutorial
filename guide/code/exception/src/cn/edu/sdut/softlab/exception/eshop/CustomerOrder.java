package cn.edu.sdut.softlab.exception.eshop;

/**
 * 本类演示了用户自定义异常的用法 .
 *
 * @author Su Baochen
 */
public class CustomerOrder {
	private static boolean inventoryOK = false;
	private static boolean priceOK = false;

	/**
	 * 程序执行入口.
	 *
	 * @param args 命令行参数
	 */
	public static void main(String[] args) {
		try {
			placeOrder();
		} catch (OutOfInventoryException e) {
			e.printStackTrace();
		} catch (PriceNotAvailableException e) {
			e.printStackTrace();
		}
	}

	public static void placeOrder() throws OutOfInventoryException, PriceNotAvailableException {
		if (!inventoryOK)
			throw new OutOfInventoryException("库存不足，请及时补充库存！");

		if (!priceOK)
			throw new PriceNotAvailableException("价格变化了，请尝试刷新获得新的价格。");
	}

}
