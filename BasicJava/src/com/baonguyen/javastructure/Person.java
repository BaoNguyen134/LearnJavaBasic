package com.baonguyen.javastructure;

public class Person {

	// Đây là một trường (Field)
	// Lưu trữ tên người.
	public String name;

	// Đây là một cấu tử, còn gọi là phương thức khởi tạo (Constructor)
	// Dùng nó để khởi tạo đối tượng.
	// Cấu tử này có một tham số.
	// Cấu tử luôn có tên giống tên class.
	public Person(String persionName) {
		// Gán giá trị từ tham số vào cho trường name.
		this.name = persionName;
	}

	// Đây là một phương thức trả về kiểu String.
	public String getName() {
		return this.name;
	}

}