package exercise;

public class Sample6 {

	// 練習問題5-7
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] array = new int[5];
		int sum = 0;
		
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*10)+1;
			System.out.println(array[i]);
			sum += array[i];
		}
		
		int average = sum /array.length ;
		
		System.out.println("合計値" + sum);
		System.out.println("平均値" + average);
		
		
		System.out.print("平均値よりも大きいのは");
		for(int i = 0; i < array.length; i++) {
			if(array[i] > average) {
				System.out.print(" " + array[i]);
			}
		}
		System.out.println();
		System.out.print("平均値よりも小さいのは");
		for(int i = 0; i < array.length; i++) {
			if(array[i] < average) {
				System.out.print(array[i] + " ");
			}
		}
	}

}
