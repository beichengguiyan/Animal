package work;

public class Animal {
	int age;
	int weight;

	public void getAge(int age) {
		this.age = age;
	}

	public void getWeight(int weight) {
		this.weight = weight;
	}

	public void run() {
		System.out.println("正在跑");

	}

	public void eat() {
		System.out.println("正在吃");
	}
}