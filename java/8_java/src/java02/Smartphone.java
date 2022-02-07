package java02;

public class Smartphone extends MobilePhone {

	private int trackNo = 1;
	private int volume = 5;

	// スマートフォンのメソッド：

	// 曲再生メソッド
	public void play() {
		System.out.println(trackNo + "曲目を再生します。");
	}

	// 曲停止メソッド
	public void stop() {
		System.out.println("音楽を止めます。");
	}

	// 音量を上げるメソッド
	public void turnUp() {

		System.out.println("volumeを6上げます。");

		volume = volume + 6;

		if (volume > 10) {

			volume = 10;
		}

		System.out.println("volumeは" + volume + "です。");

	}

	// 音量を下げるメソッド
	public void turnDown() {

		System.out.println("volumeを5下げます。");

		volume = volume - 5;

		if (volume < 0) {

			volume = 0;

		}

		System.out.println("volumeは" + volume + "です。");
	}

	// 次の曲を再生するメソッド
	public void playNextTrack() {
		trackNo = trackNo + 1;
		System.out.println(trackNo + "曲目を再生します。");
	}

	// 前の曲を再生するメソッド
	public void playPreviousTrack() {
		trackNo = trackNo - 1;
		System.out.println(trackNo + "曲目を再生します。");
	}

}