package mytoolkit.otherlanguage;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/**
 * User: john
 * Date: 11-5-11
 * Time: 下午4:52
 */
public class RubyMain {
    public static void main(String[] args) {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("jruby");
        System.out.println(engine);
    }
}
