package problemex3;

public class problem3_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Computer[] cp = new Computer[3];
        cp[0] = new PersonalComputer();     //  パーソナルコンピュータ
        cp[1] = new TabletPC();             //  タブレットPC
        cp[2] = new SmartPhone();           //
        for(Computer c:cp){
            c.showType();
            c.input();
            c.output();
            c.communication();
            System.out.println("--------------------------------------");
        }

	}

}
