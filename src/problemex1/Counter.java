package problemex1;

public class Counter {
//  カウント
    private int count = 0;
    // 静的メンバ
    public static int  totalCount = 0;
    //  コンストラクタ
    public void reset(){
    	totalCount -= count;
        count = 0;
    }
    //  カウント
    public void count(){
        count++;
        totalCount++;
    }
    //  値の取得
    public int getCount(){
        return count;
    }
    // トータルのカウント回数を記録
    public static int getTotalCount() {
    	return totalCount;
    }
 

}
