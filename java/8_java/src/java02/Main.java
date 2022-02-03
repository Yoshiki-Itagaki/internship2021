package java02;

public class Main {

	public static void main(String[] args) {

		// 携帯電話インスタンスの作成
		MobilePhone mobilePhone = new MobilePhone();

		// スマートフォンインスタンスの作成
		Smartphone smartphone = new Smartphone();

		// 以下セッターメソッド

		// 携帯電話用のセッターメソッド
		mobilePhone.setPhoneNumber("090-0000-0000");
		mobilePhone.setEmailAddress("test@a-force.co.jp");

		// スマートフォン用のセッターメソッド
		smartphone.setPhoneNumber("090-0000-0000");
		smartphone.setEmailAddress("test@a-force.co.jp");

		// 以下それぞれのメソッド呼び出し:

		// 携帯電話クラスのメソッドの呼び出し:
		System.out.println("<携帯電話クラス>");

		smartphone.call();
		smartphone.sendEmail();
		System.out.println(" ");

		// スマートフォンクラスのメソッドの呼び出し:
		System.out.println("<スマートフォンクラス>");

		smartphone.play();
		smartphone.turnUp();
		smartphone.playNextTrack();
		smartphone.turnDown();
		smartphone.stop();
		smartphone.call();
		smartphone.sendEmail();

	}

}
