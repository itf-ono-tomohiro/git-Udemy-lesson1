package exercise;

public class Sample3 {

	// 練習問題4-8
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		
		while (true) {
			int num = (int)(Math.random()*10)+1;    //  1から10までの乱数を発生させる
			System.out.println(num);
			if (num == 0) {
				break;
			}
		}
		System.out.println("終了します");

	}

}
