package com.baonguyen.array;

public class ArrayExample02 {

	public static void main(String[] args) {

		// Khai báo một mảng 5 phần tử
		int[] myArray = new int[5];

		// In ra màn hình số phần tử của mảng.
		System.out.println("Array Length = " + myArray.length);

		// Sử dụng vòng lặp for gán giá trị các phẩn tử của mảng.
		for (int index = 0; index < myArray.length; index++) {
			myArray[index] = 100 * index * index + 3;
		}

		// In ra màn hình phần tử tại chỉ số 3
		System.out.println("myArray[3] = " + myArray[3]);

	}

}