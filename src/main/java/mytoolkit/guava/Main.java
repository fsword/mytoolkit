package mytoolkit.guava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.base.Joiner;
import com.google.common.base.Predicate;
import com.google.common.base.Strings;
import com.google.common.collect.Maps;

public class Main {
	public static void main(String[] args) {
		joinSample();
		filterSample();
        stringSample();
	}

	private static void stringSample() {
		System.out.println(Strings.repeat("hello", 3));
	}

	private static void filterSample() {
		Map<String,String> map = new HashMap<String,String>();
		map.put("hello", "world");
		map.put("Emmy", "Noeter");
		map.put("Albert", "Einstein");
		map.put("John", "Smith");
		
		Map<String,String> filteredMap = Maps.filterKeys(map, new Predicate<String>(){
			public boolean apply(String key){
				return key.indexOf("l") > 0;
			}
		});
		
		System.out.println(filteredMap.size());
	}

	private static void joinSample() {
		System.out.println(Joiner.on(",").join("a", "b", "c"));
		List<String> list = Arrays.asList("a", "b", "c");
		System.out.println(Joiner.on(",").join(list));
	}
}
