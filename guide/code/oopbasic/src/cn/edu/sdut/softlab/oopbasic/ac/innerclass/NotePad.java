package cn.edu.sdut.softlab.oopbasic.ac.innerclass;

public class NotePad {

	String content;

	class Editor {

		void parseContent() {
			System.out.println("parsing:" + content);
		}
	}
}
