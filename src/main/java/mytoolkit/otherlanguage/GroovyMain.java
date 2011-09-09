package mytoolkit.otherlanguage;

import groovy.lang.GroovyClassLoader;
import groovy.lang.GroovyShell;

/**
 * User: john
 * Date: 11-5-11
 * Time: 下午4:23
 */
public class GroovyMain {
    public static void main(String[] args) {
        int i = 0;
        try{
            GroovyShell shell = new GroovyShell();
            GroovyClassLoader loader = new GroovyClassLoader();
            loader.parseClass("class Hello");
            for(i=0; i < 10000; i++){
                shell.evaluate("def mul(x, y) { x * y }\n println mul(5, 7)");
            }
        }catch (Error e){
            System.out.println(i);
            e.printStackTrace();
        }
    }
}
