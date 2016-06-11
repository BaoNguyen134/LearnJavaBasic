package com.baonguyen.loop;

public class DoWhileExample04 {

	public static void main(String[] args) {

		int value = 5;

		// Vòng lặp do-while thực thi ít nhất 1 lần.
		do {

			System.out.println("Value = " + value);

			// Tăng giá trị cho value thêm 3 đơn vị
			value = value + 3;

		} while (value < 10);

	}

}
