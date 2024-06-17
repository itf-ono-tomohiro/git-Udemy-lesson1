package problemex6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Probex61 {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
        
        Map<String, String> animal = new HashMap<>();
        animal.put("cat", "猫");
        animal.put("dog", "犬");
        animal.put("bird", "鳥");
        animal.put("tiger", "トラ");
        
        System.out.print("英語で動物の名前を入力してください：");
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);     
        //  コンソールから文字列の読み込み
        String buf = br.readLine();    
        
        System.out.println("「" + animal.get(buf) + "」です。");

	}

}
