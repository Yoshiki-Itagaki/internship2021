package java02;

public class MobilePhone {

	private String phoneNumber;
	private String emailAddress;

	// 携帯電話のメソッド：

	// 通話メソッド
	public void call() {
		System.out.println(phoneNumber + "から電話を掛けます。");
	}

	// メール送信メソッド
	public void sendEmail() {
		System.out.println(emailAddress + "からメールを送信します。");
	}

	// 以下セッターメソッド：

	// 携帯電話取得セッターメソッド
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	// メールアドレス取得メソッド
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

}