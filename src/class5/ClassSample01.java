package class5;

public class ClassSample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str1 = "one,two,three";
		String str2 = "apple orange pinapple";
		String[] strarray1 = str1.split(",");
		String[] strarray2 = str2.split(" ");
		
		for(String s : strarray1) {
			System.out.println(s);
		}
		
		for(String s : strarray2) {
			System.out.println(s);
		}

	}

}
