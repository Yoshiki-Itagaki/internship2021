package jp.co.aforce.y.itagaki.human;

public class American extends Mankind implements Humannable {
	private String name;

	// コンストラクター定義
	public American(String name) {
		this.name = name;
	}

	// sayHelloメソッド：
	@Override
	public void sayHello() {
		System.out.println("Hello!");
		System.out.println("My name is " + name + ".");
	}

}