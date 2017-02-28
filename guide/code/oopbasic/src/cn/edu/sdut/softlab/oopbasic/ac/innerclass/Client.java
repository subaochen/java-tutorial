package cn.edu.sdut.softlab.oopbasic.ac.innerclass;

public class Client {

	public static void main(String[] args) {
		NotePad note = new NotePad();
		note.content = "test string";
		NotePad.Editor editor = note.new Editor();
		editor.parseContent();
	}

}
