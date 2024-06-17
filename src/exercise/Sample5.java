package exercise;

public class Sample5 {

	// 練習問題4-18
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i = 0; i < 10; i++ ) {
			for(int j = 0; j < 10; j++) {
				if(i == j) {
					System.out.print("□");
				}else {
					System.out.print("■");
				}
			}
			System.out.println("");
		}
		

	}

}
