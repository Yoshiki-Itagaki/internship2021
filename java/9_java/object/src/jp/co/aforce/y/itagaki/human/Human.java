package jp.co.aforce.y.itagaki.human;

public interface Human {
	// Human interfaceの宣言

	// セッターメソッド: String birthdateに値を設定する
	public void setBirthdate(String birthdate);

	// ゲッターメソッド:返り値を受け取る
	public String getBirthdate();

	// 年齢を計算する
	public void getAge() throws Exception;

}
