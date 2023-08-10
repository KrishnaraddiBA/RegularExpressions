import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {
public static void main(String[] args) {
//	Pattern p = Pattern.compile("[abcd]");
//	Pattern p = Pattern.compile("[a-z]");
//	Pattern p = Pattern.compile("[a-zA-Z0-9]");
//	Pattern p = Pattern.compile("[^a-z]");
//	Pattern p = Pattern.compile("[^a-zA-Z0-9]");
	Pattern p = Pattern.compile("[0-9]{10}");
	Matcher m = p.matcher("9916152343");
//	Matcher m = p.matcher("a6b&*p=cd");
	while (m.find()) {
		System.out.println(m.start()+"....."+m.group());
		
	}
}

}
