package com.baonguyen.controlflow;

public class ElseIfExample02 {

	public static void main(String[] args) {
		/*
		 * Các toán tử thông thường
		 * 
		 * > Lớn hơn 
		 * < Nhỏ hơn 
		 * >= Lớn hơn hoặc bằng 
		 * <= Nhỏ hơn hặc bằng 
		 * && Và 
		 * || hoặc 
		 * == So sánh bằng 
		 * != So sánh khác nhau 
		 * ! Phủ định
		 */

		// Khai báo một biến int mô phỏng tuổi của bạn.
		int age = 18;

		// Kiểm tra tuổi nhỏ hơn hoặc bằng 17
		if (age <= 17) {
			System.out.println("You are 17 or younger");
		}

		// Kiểm tra tuổi bằng 18
		else if (age == 18) {
			System.out.println("You are 18 year old");
		}
		// Kiểm tra tuổi lớn hơn 18 và nhỏ hơn 40
		else if (age > 18 && age < 40) {
			System.out.println("You are between 19 and 39");
		}
		// Trường hợp còn lại (Lớn hơn hoặc bằng 40)
		else {
			// Một câu lệnh kiểm tra nằm bên trong.
			// Kiểm tra tuổi khác 50.
			if (age != 50) {
				System.out.println("You are not 50 year old");
			}

			// Câu lệnh phủ định tuổi bằng 50, nghĩa là khác 50.
			if (!(age == 50)) {
				System.out.println("You are not 50 year old");
			}

			// Nếu tuổi là 60 hoặc 70
			if (age == 60 || age == 70) {
				System.out.println("You are 60 or 70 year old");
			}
		}

	}

}