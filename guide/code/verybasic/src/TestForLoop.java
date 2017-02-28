public class TestForLoop { // |\longremark{类名首字母大写，采用驼峰命名法}|
	public static void main(String[] args) { // |\longremark{注意缩进和大括号的匹配}|
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		//System.out.println(i); // |\longremark{变量i只在for循环内部有效，因此这里打印变量i的值是错误的}|

		int k;// |\longremark{在这里定义循环变量不是一个好的习惯。顾名思义，循环变量是循环体内使用的变量，在这里定义循环变量导致在循环体外能够访问此循环变量，存在被意外修改的隐患}|
		for (k = 0; k < 10; k++) {
			System.out.println(k);
		}

		System.out.println(k);
	}
}

// |\showremarks|
