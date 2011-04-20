package mytoolkit.practise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 
 * 返回的map分为两层，第一层是record对象按照name值的第一个字母分组（不区分大小写），
 * 第二层是在之前分组内部统计重复name值的record
 * 举例:
 * 对于如下数据：
	("Monica",19));
	("john",21));
	("jean",21));
	("smith",23));
	("smith",23));
	("smith",23));
	("johnson",22));
	("sam",21));
	("sam",22));
	("Alexander",23));
	("aladdin",22));
	("aladdin",22));
	("simon",21));
	("Abraham",22));
 * 应该打印出下列结果：
 * a:
 * 		Alexander:1
 * 		aladdin:2
 * 		Afraham:1
 * s:
 * 		sam:2
 * 		smith:3
 * 		simon:1
 * j:
 * 		john:1
 * 		jean:1
 * 		johnson:1
 * m:
 * 		Monica:1
 * @author john
 *
 */
public class Main {
	public static void main(String[] args) {
		List<Record> list = new ArrayList<Record>();
		list.add(new Record("Monica",19));
		list.add(new Record("john",21));
		list.add(new Record("jean",21));
		list.add(new Record("smith",23));
		list.add(new Record("johnson",22));
		list.add(new Record("sam",21));
		list.add(new Record("Alexander",23));
		list.add(new Record("aladdin",22));
		list.add(new Record("simon",21));
		list.add(new Record("Abraham",22));
		Map<String, Map<String, Integer>> recordMap = doSth(list);
		printMap(recordMap);
	}

	/**
	 * 打印出传入的map，格式参照 doSth 的javadoc
	 * @param recordMap
	 */
	private static void printMap(Map<String, Map<String, Integer>> recordMap) {
		//TODO 请完成剩余代码
	}

	/**
	 * 将传入的list数据转换为map
	 * @param list
	 * @return 
	 */
	private static Map<String, Map<String, Integer>> doSth(List<Record> list) {
		//TODO 请完成剩余代码
		return null;
	}
}
