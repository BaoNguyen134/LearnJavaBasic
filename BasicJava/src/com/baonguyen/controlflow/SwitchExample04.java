package com.baonguyen.controlflow;

public class SwitchExample04 {

	public static void main(String[] args) {

		// Khai báo một biến age (tuổi)
		int age = 18;

		// Kiểm tra giá trị của age
		switch (age) {
		case 18:// Trường hợp tuổi bằng 18
			System.out.println("You are 18 year old");
			break;
		case 20:// Trường hợp tuổi bằng 20
			System.out.println("You are 20 year old");
			break;
		default:// Các trường hợp còn lại
			System.out.println("You are not 18 or 20 year old");
		}

	}

}