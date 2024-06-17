package problemex5;

import java.util.ArrayList;

public class Probex57 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(true ) {
			int num = (int)(Math.random()*11);
			System.out.println("0～10の値を出力" + num);
			
			if(num == 0) {
				break;
			}else {
				System.out.print("出力された数:");
				if(list.size() == 0) {
					list.add(num);
					System.out.println(list.get(0) + " ");
				}else {
					for(int i = 0; i < list.size(); i++) {
						if(list.get(i) > num) {
							list.add(i,num);
							break;
						}else {							
							if(i == list.size() - 1) {
								list.add(num);
								break;
							}
						}
					}
					for(int x: list) {
						System.out.print(x + " ");
					}
				}
				System.out.println();
				System.out.println();
			}
		}

	}
}
