package jp.co.aforce.y.itagaki.human;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import jp.co.aforce.y.itagaki.Mankind;

public class Japanese extends Mankind implements Human {

	// フィールドの設定
	private String nameJP;
	private String birthdate;

	public Japanese(String nameJP) {
		this.nameJP = nameJP;
	}

	// 挨拶・自己紹介メソッド：インターフェースから
	public void sayHello() {
		System.out.println("こんにちは！　私は" + nameJP + "です。");
	}

	// セッターメソッド: インターフェースから
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	// ゲッターメソッド：抽象クラスから
	@Override
	public String getBirthdate() {
		return this.birthdate;
	}

	// 年齢計算メソッド
	public void getAge() throws ParseException {

		// 現在の時刻を取得
		Date date = new Date();

		// 太郎とJohnの誕生日データ変換

		try {
			// simpleDateFormatで太郎とJohnの誕生日データをそれぞれ
			// Dateで取得した現在時刻の表示と同等の形式に変換する:

			// 太郎、Johnそれぞれの誕生日を既定の形式("yyyy/mm/dd HH:mm:ss")に変換
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");

			// 太郎、Johnそれぞれの誕生日の変換されたデータを新たなStringに代入
			String birthdate = getBirthdate();

			// 新たにStringにそれぞれ代入された誕生日データをDateのフォーマットに変換
			Date d = sdf.parse(birthdate);

			// 現在時刻と誕生日時点の時間差を秒単位にして計算する。
			// その後概算して整数の形（年齢）に直す。
			long age = date.getTime() - d.getTime();
			int ageFormatted = (int) (age / 3.154e+10);

			System.out.println("私は" + ageFormatted + "歳です。 ");

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}
}
