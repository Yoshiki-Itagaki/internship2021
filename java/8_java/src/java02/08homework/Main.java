package java02;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("携帯電話クラス");

		MobilePhone mobilePhone = new MobilePhone();

		mobilePhone.call("090-0000-0000");
		mobilePhone.sendEmail("test@a-force.co.jp");
		System.out.println(" ");

		System.out.println("スマートフォンクラス");
		Smartphone smartphone = new Smartphone();

		smartphone.setVolUp(6);
		smartphone.setVolDown(5);

		smartphone.play();
		smartphone.turnUp();
		smartphone.playNextTrack(1);
		smartphone.turnDown();
		smartphone.stop();
		smartphone.call("090-0000-0000");
		smartphone.sendEmail("test@a-force.co.jp");

	}

}
