package problemex5;

import java.util.ArrayList;

public class Probex52 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		while(true ) {
			int num = (int)(Math.random()*11);
			System.out.println("0～10の値を出力" + num);
			if(num == 0) {
				break;
			}
			array.add(num);
		}
		
		for(int i = array.size() - 1; i >= 0; i--) {
			System.out.println(array.get(i));
		}
		

	}

}
