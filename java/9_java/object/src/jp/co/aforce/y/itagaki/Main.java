package jp.co.aforce.y.itagaki;

import java.text.ParseException;

import jp.co.aforce.y.itagaki.human.American;
import jp.co.aforce.y.itagaki.human.Japanese;

public class Main {

	public static void main(String[] args) throws ParseException {

		// 日本人インスタンス作成
		System.out.println("<太郎クラス>");
		Japanese j = new Japanese("太郎");
		j.setBirthdate("1980/1/13");
		j.sayHello();
		j.getAge();

		// アメリカ人インスタンス作成
		System.out.println("\n<Johnクラス>");
		American a = new American("John");
		a.setBirthdate("1990/12/31");
		a.sayHello();
		a.getAge();

	}

}
