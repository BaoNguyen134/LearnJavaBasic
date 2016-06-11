package com.baonguyen.inheritance;

public class AnimalTest {

	public static void main(String[] args) {

		// Khai báo một đối tượng Cat.
		Cat cat = new Cat();

		// Kiểm tra xem 'cat' có phải là đối tượng Animal ko.
		// Kết quả rõ ràng là true.
		boolean isAnimal = cat instanceof Animal;
		System.out.println("cat instanceof Animal? " + isAnimal);

		// ==> Meo
		// Gọi vào method say() của Cat.
		cat.say();

		// Khai báo một đối tượng Animal
		// Khởi tạo đối tượng thông qua cấu tử của Cat.
		Animal cat2 = new Cat();

		// ==> Meo
		// Nó vẫn gọi vào method say() của Cat.
		cat2.say();

		// Tạo đối tượng Animal
		// Thông qua cấu tử của class con, Ant.
		Animal ant = new Ant();

		// ==> ..
		// Ant không có method say()
		// Nó gọi vào method say() thừa kế từ class cha (Animal).
		ant.say();

	}

}
