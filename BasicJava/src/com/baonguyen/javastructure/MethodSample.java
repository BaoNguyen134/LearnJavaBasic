package com.baonguyen.javastructure;

public class MethodSample {

	public String text = "Some text";

	// Cấu tử mặc định
	public MethodSample() {

	}

	// Đây là một phương thức trả về kiểu String.
	// Phương thức này không có tham số
	public String getText() {
		return this.text;
	}

	// Đây là một phương thức có 1 tham số String.
	// Phương thức này trả về void (Hay gọi là ko trả về gì)
	public void setText(String text) {
		// this.text tham chiếu tới trường text.
		// phân biệt với tham số text.
		this.text = text;
	}

	// Đây là một phương thức tĩnh.
	// Trả về kiểu int, có 3 tham số.
	public static int sum(int a, int b, int c) {
		int d = a + b + c;
		return d;
	}

}
