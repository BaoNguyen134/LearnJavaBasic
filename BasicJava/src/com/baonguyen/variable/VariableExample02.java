package com.baonguyen.variable;

public class VariableExample02 {

	public static void main(String[] args) {

		// Khai báo 3 số tự nhiên 64 bit (long)
		long firstNumber, secondNumber, thirdNumber;

		// Gán giá trị cho firstNumber
		// Chữ L ở cuối để nói với java đây là kiểu long, phân biệt với kiểu tự
		// nhiên int.
		firstNumber = 100L;

		// Gán giá trị cho secondNumber
		secondNumber = 200L;

		// Gán giá trị cho thirdNumber
		thirdNumber = firstNumber + secondNumber;

		System.out.println("First Number = " + firstNumber);
		System.out.println("Second Number = " + secondNumber);
		System.out.println("Third Number = " + thirdNumber);

	}

}
