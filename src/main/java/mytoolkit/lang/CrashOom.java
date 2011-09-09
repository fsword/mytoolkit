package mytoolkit.lang;

import java.util.ArrayList;

public class CrashOom {
	 public static void main(String[] args) {
        ArrayList<StubClass> list = new ArrayList<StubClass>();
        int count = 1000000000;
        for (int i = 0; i < count; i++) {
            StubClass obj = new StubClass();
            list.add(obj);
        }
    }
 }

