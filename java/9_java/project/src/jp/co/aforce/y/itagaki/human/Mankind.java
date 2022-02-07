package jp.co.aforce.y.itagaki.human;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Mankind {

	// フィールドの設定
	private String birthdate;
	private long age;
	private int ageParsed;

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	// 誕生日を取得する
	public String getBirthdate() {
		return this.birthdate;
	}

	// calculateAgeメソッド: 年齢計算
	public void calculateAge() throws ParseException {

		// 現在の時刻を取得
		Date date = new Date();

		// 太郎とJohnの誕生日データ変換

		try {
			//

			// 誕生日を既定の形式("yyyy/mm/dd HH:mm:ss")に変換
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");

			// 取得された誕生日データを新たに String birthdate に代入
			String birthdate = getBirthdate();

			// String birthdate に格納された誕生日データを Dateフォーマットに変換
			Date parseBirthdate = sdf.parse(birthdate);

			// 現在時刻と誕生日時点の時間差を秒単位にして計算
			// その後概算して整数の形（年齢）に直す。
			age = date.getTime() - parseBirthdate.getTime();
			ageParsed = (int) (age / 3.154e+10);
			System.out.println(ageParsed);

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return;

	}

}
