package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		

		        //第7回課題

		        //課題１　合計と平均の出力

		        /*1. 標準入力された 2つの値の合計と平均を出力するプログラムを作成。
		　数値以外の標準入力以外を受け取った場合、再入力を求めるようにする。
		　標準入力の受け取り方は講義内で説明
		<実行結果>
		　合計：〇〇
		　平均：〇〇
		         */

		        int num1, num2;
		        double sum, average;
		        boolean isNumber;

		        //それぞれ２つの数値を入力

		        //do-whileループを用いて、整数入力でない限りは処理を完了できないようにする。
		        do {
		            System.out.println("整数を入力してください。");
		            Scanner n1 = new Scanner(System.in);

		            System.out.println("もう一つ整数を入力してください。");
		            Scanner n2 = new Scanner(System.in);

		            System.out.println(" ");

		            if (n1.hasNextInt() && n2.hasNextInt()) {
		                num1 = n1.nextInt();
		                num2 = n2.nextInt();
		                sum = num1 + num2;
		                average = (sum) / 2;
		                System.out.println("2つの数の合計: " + sum + "; 平均: average: " + average);
		                isNumber = true;

		                break;

		            } else {
		                System.out.println("[注意]整数を入力してください。");
		                System.out.println(" ");
		                isNumber = false;
		            }
		        } while(isNumber = true);

		        //何故かbreakを使わないと、do-whileループを抜けられなかったので理由を教えていただければ幸いです。



		        //課題２　BMI計算プログラム

		        /*2. 身長・体重を標準入力で受け取り、BMI を計算するプログラムを書きましょう。また、BMI の値を元に肥満度を出力しましょう。
		数値以外の標準入力以外を受け取った場合や、0 除算が発生する場合、正しい値で入力するよう出力する
		　BMI = 体重(kg)÷身長(m)の二乗
		<判定基準>
		　18.5未満→やせ
		　18.5〜25未満→標準
		　25〜30未満→肥満
		　30以上→高度肥満
		<実行結果>
		　あなたは「〇〇」です。
		        */

		        double height, weight, bmi, heightAdjusted, heightPowered;
		        boolean isCorrectInput;

		        //do-whileループを用いて、整数入力でない限りは処理を完了できないようにする。
		        do {
		            System.out.println("あなたの身長(cm)を教えてください。");
		            Scanner Height = new Scanner(System.in);


		            System.out.println("あなたの体重(kg)も教えてください。");
		            Scanner Weight = new Scanner(System.in);

		            System.out.println(" ");

		            if (Height.hasNextDouble() && Weight.hasNextDouble()) {
		                isCorrectInput = true;
		                height = Height.nextDouble();
		                weight = Weight.nextDouble();
		                heightAdjusted = height / 100;
		                System.out.println(heightAdjusted);
		                heightPowered = Math.pow(heightAdjusted, 2);
		                System.out.println(heightPowered);
		                bmi = weight/ heightPowered;
		                bmi = Math.round(bmi * 100.0) /100.0;

		                if(bmi < 18.5){
		                    System.out.println("あなたのBMI: " + bmi);
		                    System.out.println("あなたはやせ型です。");

		                    break;
		                }
		                else if(bmi >= 18.5 && bmi < 25){
		                    System.out.println("あなたのBMI: " + bmi);
		                    System.out.println("あなたは標準体型です。");

		                    break;
		                }
		                else if(bmi >= 25 && bmi < 30){
		                    System.out.println("あなたのBMI: " + bmi);
		                    System.out.println("あなたは肥満です。");

		                    break;
		                }
		                else{
		                    System.out.println("あなたのBMI: " + bmi);
		                    System.out.println("あなたは高度肥満です。");

		                    break;
		                }
		            } else {
		                System.out.println("[注意]不適切な入力です。");
		                System.out.println("もう一度入力してください。");
		                System.out.println(" ");
		                isCorrectInput = false;
		            }
		        } while (isCorrectInput = true);
		        
		        System.out.println(" ");



		        //課題３　借金返済シミュレーションプログラム

		        /*3. 借金返済シミュレーションプログラムを作成しましょう。
		　借り入れ金額：¥250,000
		　年利率 (%)：14.0
		　月々の返済額：¥30,000
		　月々の借金は、借金の利息年利率 / 12（月割り）分増加するが、返済分だけ減るとする。
		　小数点以下は丸めず、そのまま出力してよい。
		<実行結果>
		　1ヶ月目：返済額=30000円, 残り222916.6666666667円
		　2ヶ月目：返済額=30000円, 残り195517.36111111115円
		　　　　　　　　　　　・・・
		　8ヶ月目：返済額=30000円, 残り24276.637150233415円
		　9ヶ月目：返済額24559.864583652805, 返済完了。
		         */

		        double debt = 250000, payment = 30000, annualRate = 0.14;
		        int month = 0;
		        double monthlyRate = annualRate / 12;

		      while (debt > 0){
		           debt = (debt * (1 + monthlyRate)) - payment;
		           int debtRounded = (int) debt;
		           month += 1;

		           if(debtRounded < 0){
		               debtRounded = 0;
		               System.out.println(month + "か月目、借金返済まで残り" + debtRounded + "円");
		           }
		           else {
		               System.out.println(month + "か月目、借金返済まで残り" + debtRounded + "円");
		               continue;
		           }
		        }

		    }
		 
	}


