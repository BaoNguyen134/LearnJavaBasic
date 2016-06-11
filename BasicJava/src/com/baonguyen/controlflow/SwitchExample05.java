package com.baonguyen.controlflow;

public class SwitchExample05 {

	public static void main(String[] args) {

		// Khai báo một biến age (tuổi)
		int age = 90;

		// Kiểm tra giá trị của age
		switch (age) {
		// Trường hợp tuổi bằng 18
		case 18:
			System.out.println("You are 18 year old");

			// Các trường hợp 20, 30, 40 tuổi.
		case 20:
		case 30:
		case 40:
			System.out.println("You are " + age);
			break;
		default:// Các trường hợp còn lại
			System.out.println("Other age");
		}

	}

}
