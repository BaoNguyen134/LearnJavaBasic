package com.baonguyen.loop;

public class ForLoopExample02 {

	// Đây là một ví dụ tính tổng các số từ 1 tới 100, và in kết quả ra màn
	// hình.
	public static void main(String[] args) {

		// Khai báo một biến
		int total = 0;

		// Khai báo một biến value
		// Có giá trị ban đầu 1
		// Sau mỗi vòng lặp giá trị tăng lên 1
		// Chú ý: value++ tương đương với câu lệnh: value = value + 1;
		// value-- tương đương với câu lệnh: value = value - 1;
		for (int value = 1; value <= 100; value++) {

			// Gán giá trị total bằng giá trị cũ cộng thêm value.
			total = total + value;
		}

		System.out.println("Total = " + total);

	}

}
