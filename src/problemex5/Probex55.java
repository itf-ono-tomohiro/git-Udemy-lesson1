package problemex5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Probex55 {

	public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        //  コンソールから文字列の読み込み
        ArrayList<String> list = new ArrayList<String>();
        
        while(true) {
        	System.out.print("文字列を入力:");
        	String buf = br.readLine();
        	if(buf.equals("")) {
        		break;
        	}
        	list.add(buf);
        }
        
        for(int i = 0; i < list.size(); i++) {
        	if(list.get(i).length() >= 5) {
        		list.remove(i);
        	}
        }
        
        for(String word: list) {
        	System.out.print(word + " ");
        }
    }
}