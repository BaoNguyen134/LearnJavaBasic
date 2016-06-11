package com.baonguyen.loop;

public class ForLoopExample01 {

	public static void main(String[] args) {

		// Khai báo một biến mô tả bước thứ mấy (Vòng lặp thứ mấy)
		int step = 1;

		// Khai báo một biến value với giá trị bắt đầu là 0
		// Sau mỗi một vòng lặp value lại được công thêm 3 (Nghĩa là bước tăng
		// 3)
		// Và vòng lặp sẽ kết thúc khi value lơn hơn hoặc bằng 10
		// Theo code này nghĩa là mỗi vòng lặp value sẽ tăng 3
		// Vòng lặp sẽ dừng lại khi (value < 10) không còn đúng nữa.

		for (int value = 0; value < 20; value = value + 3) {

			System.out.println("Step = " + step + "  value = " + value);

			// Tăng giá trị step lên 1, sau mỗi vòng lặp
			step = step + 1;

		}

	}

}
