package problemex6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Probex62 {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
        
        Map<String, String> number = new HashMap<>();
        number.put("1","一");
        number.put("2","二");
        number.put("3","三");
        number.put("4","四");
        number.put("5","五");
        number.put("6","六");
        number.put("7","七");
        number.put("8","八");
        number.put("9","九");
        number.put("0","〇");
        
        
        System.out.print("整数の値を入力してください：");
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);     
        //  コンソールから文字列の読み込み
        String buf = br.readLine();    
        
        
        try {
        	Integer.parseInt(buf);
        } catch (NumberFormatException e) {
        	System.out.println("整数の値を入力してください。");
        	return;
        }
        
        String result = "";
        for(int i = buf.length() - 1; i >= 0; i--) {
        	result = number.get(String.valueOf(buf.charAt(i))) + result;
        	if((buf.length() - i) % 3== 0 && i != 0) {
        		result = "," + result;
        	}
        }
        System.out.println("変換結果" + result);
		
        

	}

}
