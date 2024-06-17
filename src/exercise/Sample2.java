package exercise;

public class Sample2 {

	// 練習問題3-16
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int temp = (int)(Math.random()*46)-10;    //  -10から35までの乱数を発生させる
		
		System.out.println("摂氏" + temp + "度");
		
		if(temp >= 30) {
			System.out.println("真夏日です。");
		}else if(temp >= 25 && temp < 30){
			System.out.println("夏日です。");
		}else if(temp < 0){
			System.out.println("真冬日です。");
		}

	}

}
