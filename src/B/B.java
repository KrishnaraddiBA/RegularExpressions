package B;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B {
	public static void main(String[] args) {
//		Pattern p = Pattern.compile("\\s");
//		Pattern p = Pattern.compile("\\S");
//		Pattern p = Pattern.compile("\\d");
//		Pattern p = Pattern.compile("\\D");
//		Pattern p = Pattern.compile("\\w");
		Pattern p = Pattern.compile("\\W");
		Matcher m = p.matcher("a6b @#9 D E");
		while (m.find()) {
			System.out.println(m.start()+"....."+m.group());
		}
	}

}
