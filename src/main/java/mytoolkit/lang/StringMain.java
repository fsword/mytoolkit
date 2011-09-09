package mytoolkit.lang;

//import org.springframework.util.StringUtils;

import org.apache.commons.lang.StringUtils;

public class StringMain {
	public static void main(String[] args) {
		System.out.println(StringUtils.isEmpty(""));
		System.out.println(StringUtils.isEmpty(null));
		System.out.println(StringUtils.isBlank(""));
		System.out.println(StringUtils.isBlank("    "));
		System.out.println(StringUtils.split("hello,hello,hello world","[,| ]").length);;
		System.out.println(("hello,hello,hello world".split("[,| ]").length));
	}
}
