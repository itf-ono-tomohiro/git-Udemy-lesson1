package problemex6;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Probex63 {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
        
        Set<Integer> number = new HashSet<Integer>();
        
        System.out.print("乱数：");
        
        for(int i = 0; i < 10; i++) {
        	int num = (int)(Math.random()*10) + 1;    //  1から10までの乱数を発生させる
        	System.out.print(num + " ");
        	number.add(num);
        }
        
        System.out.println();
        System.out.print("出現した数：");
        
        for(int num2: number) {
        	System.out.print(num2 + " ");
        }
        
        
        
	}
}
