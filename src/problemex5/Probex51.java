package problemex5;

import java.util.ArrayList;

public class Probex51 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Integer> odd = new ArrayList<Integer>();
		ArrayList<Integer> even = new ArrayList<Integer>();
		
		while(true) {
			int num = (int)(Math.random()*11);
			System.out.println("0～10の値を出力" + num);
			if(num == 0) {
				break;
			}
			if (num % 2 == 0) {
				even.add(num);
			}else {
				odd.add(num);
			}
		}
		System.out.print("偶数");
		for(int num1: even) {
			System.out.print(num1 + " ");
		}
		System.out.println();
		System.out.print("奇数");
		for(int num2: odd) {
			System.out.print(num2 + " ");
		}

	}

}
