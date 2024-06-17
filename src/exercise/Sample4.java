package exercise;

public class Sample4 {

	// 練習問題4-13
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		
		int num = (int)(Math.random()*10)+1;    //  1から10までの乱数を発生させる
		
		if (num >= 5) {
			for(int i = 0; i < num; i++) {
				System.out.print("★");
			}
		}else {
			System.out.println(num);
		}
		

	}

}
