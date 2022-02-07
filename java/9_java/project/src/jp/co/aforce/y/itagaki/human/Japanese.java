package jp.co.aforce.y.itagaki.human;

public class Japanese extends Mankind implements Humannable {
	private String name;

	// コンストラクター定義
	public Japanese(String name) {
		this.name = name;
	}

	// sayHelloメソッド
	@Override
	public void sayHello() {
		System.out.println("こんにちは！");
		System.out.println("私は" + name + "です。");
	}

}