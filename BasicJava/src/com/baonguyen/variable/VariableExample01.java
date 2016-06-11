package com.baonguyen.variable;

public class VariableExample01 {

	public static void main(String[] args) {

		// Dùng cho kiểu số nguyên có 4 loại: Byte, short, int, long
		// Kiểu số thực ta có: float, double
		// Kiểu ký tự: char
		// Kiểu logic: trả về giá trị true hoặc false (đúng hoặc sai)

		// Khai báo một biến, có kiểu là số tự nhiên 32 bit.
		int firstNumber;

		// Gán giá trị cho firstNumber
		firstNumber = 10;

		System.out.println("First Number = " + firstNumber);

		// Khai báo một số thực 32 bit (float)
		// Số này được gán giá trị 10.2
		// Chữ f ở cuối giúp java hiểu đây là kiểu float.
		float secondNumber = 10.2f;

		System.out.println("Second Number = " + secondNumber);

		// Khai báo một số thực 64 bit
		// Số này được gán giá trị 10.2
		// Chữ d ở cuối giúp java hiểu đây là kiểu double. Phân biệt với kiểu
		// float.
		double thirdNumber = 10.2d;

		System.out.println("Third Number = " + thirdNumber);

		// Khai báo một kiểu ký tự
		char ch = 'a';

		System.out.println("Char ch = " + ch);
	}

}