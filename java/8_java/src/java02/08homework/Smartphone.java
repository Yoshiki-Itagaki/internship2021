package java02;

public class Smartphone extends MobilePhone {

	private int trackNo = 1;
	private int volume = 5;
	int volUp;
	int volDown;
	int goNext;
	int goBack;

	public void setVolUp(int volUp) {
		this.volUp = volUp;
	}

	public int getVolUp() {

		return this.volUp;
	}

	public void setVolDown(int volDown) {
		this.volDown = volDown;

	}

	public int getVolDown() {

		return this.volDown;
	}

	public void play() {
		System.out.println(trackNo + "曲目を再生します。");
	}

	public void stop() {
		System.out.println("音楽を止めます。");
	}

	public void turnUp() {

		System.out.println("volumeを" + volUp + "上げます。");

		if ((volume = volume + volUp) > 10) {

			volume = 10;

		} else {

		}

		System.out.println("volumeは" + volume + "です。");

	}

	public void turnDown() {

		System.out.println("volumeを" + volDown + "下げます。");

		if ((volume = volume - volDown) < 0) {

			volume = 0;

		} else {

		}

		System.out.println("volumeは" + volume + "です。");
	}

	public void playNextTrack(int goNext) {
		trackNo = trackNo + goNext;
		System.out.println(trackNo + "曲目を再生します。");
	}

	public void playPreviousTrack(int goBack) {
		trackNo = trackNo + goBack;
		System.out.println(trackNo + "曲目を再生します。");
	}

	@Override
	public void call(String phoneNumber) {
		super.call(phoneNumber);
	}

	@Override
	public void sendEmail(String emailAddress) {
		super.sendEmail(emailAddress);
	}

}
