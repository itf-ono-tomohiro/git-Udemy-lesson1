package class7;

import java.util.Locale;

public class ClassSample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Locale jp = new Locale("ja", "JP");
		Locale us = new Locale("en", "US");
		Locale ch = new Locale("zh", "CN");
		
		//各ロケールの言語と国名を出力
        System.out.println("日本のロケール 言語 : "
        + jp.getDisplayLanguage() + " 国名 : " + jp.getDisplayCountry());
        System.out.println("アメリカのロケール 言語 : "
        + us.getDisplayLanguage() + " 国名 :" + us.getDisplayCountry());
        System.out.println("中国のロケール 言語 : "
        + ch.getDisplayLanguage() + " 国名 : " + ch.getDisplayCountry() );

	}

}
