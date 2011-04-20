package mytoolkit.noclass;

/**
 * User: john
 * Date: 11-4-20
 * Time: 上午11:00
 */
public class Main {
    public static void main(String[] args) {
        try{
            new Foo();
        }catch (Exception e){//cannot handle it
            e.printStackTrace();
        }
        try{
            new Foo();
        }catch (ExceptionInInitializerError e){//cannot handle it
            e.printStackTrace();
        }
    }
}
