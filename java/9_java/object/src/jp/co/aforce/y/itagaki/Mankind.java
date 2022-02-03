package jp.co.aforce.y.itagaki;

public abstract class Mankind {
	// Japanese、Americanクラスそれぞれに共通するメソッドを記述

	// フィールドの設定: 誕生日データを収納する変数
	private String birthdate;

	// ゲッターメソッド:返り値を受け取る
	public String getBirthdate() {
		return this.birthdate;
	}

}
