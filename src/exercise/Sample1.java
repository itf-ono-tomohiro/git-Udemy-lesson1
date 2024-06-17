package exercise;

public class Sample1 {

	// 練習問題3-16
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int num = (int)(Math.random()*100)+1;    //  1から100までの乱数を発生させる
		
		System.out.println(num);
		
		if(num % 2==0 && num % 3 ==0) {
			System.out.println("2と3の公倍数です。");
		}else {
			if(num % 2 == 0) {
				System.out.println("2の倍数です。");
			}else if(num % 3 == 0) {
				System.out.println("3の倍数です。");
			}
		}

	}

}
