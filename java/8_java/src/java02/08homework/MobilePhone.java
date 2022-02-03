package java02;

public class MobilePhone {

	private String phoneNumber;
	private String emailAddress;

	public void call(String phoneNumber) {
		System.out.println(phoneNumber + "から電話を掛けます。");
	}

	public void sendEmail(String emailAddress) {
		System.out.println(emailAddress + "からメールを送信します。");
	}

}
