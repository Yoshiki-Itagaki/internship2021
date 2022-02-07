package jp.co.aforce.y.itagaki;

import java.text.ParseException;

import jp.co.aforce.y.itagaki.human.American;
import jp.co.aforce.y.itagaki.human.Japanese;

public class Main {

	public static void main(String[] args) {

		// 日本人インスタンス作成
		System.out.println("<太郎クラス>");
		Japanese j = new Japanese("太郎");
		j.setBirthdate("1990/1/13");
		j.sayHello();
		try {
			j.calculateAge();
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

		// アメリカ人インスタンス作成
		System.out.println("\n<Johnクラス>");
		American a = new American("John");
		a.setBirthdate("1980/12/31");
		a.sayHello();
		try {
			a.calculateAge();
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
