package problemex5;

import java.util.ArrayList;

public class Probex53 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(true ) {
			int num = (int)(Math.random()*101);
			System.out.println("0～10の値を出力" + num);
			if(num == 0) {
				break;
			}
			list.add(num);
		}
		
		for(int i = 1; i < 10; i++) {
			int cnt = 0;
			System.out.print("一の位が" + i + ":");
			for(int j = 0; j < list.size(); j++) {
				if(list.get(j) % 10 == i ) {
					System.out.print(list.get(j) + " ");
					cnt++;
				}
			}
			if(cnt == 0) {
				System.out.print("なし");
			}
			System.out.println();
		}

	}

}
