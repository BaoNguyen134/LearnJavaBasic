package com.baonguyen.array;

public class ArrayExample01 {

	public static void main(String[] args) {

		// // Khai báo một mảng, chưa chỉ rõ số phần tử.
		// int[] array1;
		//
		// // Khởi tạo mảng với 100 phần tử
		// // Các phần tử chưa được gán giá trị cụ thể
		// array1 = new int[100];
		//
		// // Khai báo một mảng chỉ rõ số phần tử
		// // Các phần tử chưa được gán giá trị cụ thể
		// double[] array2 = new double[10];
		//
		// // Khai báo một mảng mà các phần tử được gán giá trị cụ thể.
		// // Mảng này có 4 phần tử
		// long[] array3= {10L, 23L, 30L, 11L};

		// Khai báo một mảng 5 phần tử
		int[] myArray = new int[5];

		// Chú ý phần tử đầu tiên của mảng có chỉ số là 0:

		// Gán giá trị cho phần tử đầu tiên (Chỉ số 0)
		myArray[0] = 10;

		// Gán giá trị cho phần tử thứ hai (Chỉ số 1)
		myArray[1] = 14;

		myArray[2] = 36;
		myArray[3] = 27;

		// Giá giá trị cho phần tử thứ 5 (Phần tử cuối cùng trong mảng)
		myArray[4] = 18;

		// In ra màn hình số phần tử của mảng.
		System.out.println("Array Length = " + myArray.length);

		// In ra màn hình phần tử tại chỉ số 3 (Phần tử thứ 4 trong mảng)
		System.out.println("myArray[3] = " + myArray[3]);

		// Sử dụng vòng lặp for để in ra các phần tử trong mảng.
		for (int index = 0; index < myArray.length; index++) {
			System.out.println("Element " + index + " = " + myArray[index]);
		}

	}

}
