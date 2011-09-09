package mytoolkit;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * User: john
 * Date: 11-8-18
 * Time: 下午3:54
 */
public class SafeDateFormat {

    private String pattern;

    public SafeDateFormat(String pattern) {
        this.pattern = pattern;
    }

    public String format(Date date){
        return InnerFormater.format(pattern,date);
    }

    private static class InnerFormater{
        private static Map<String,ThreadLocal<DateFormat>> dfMap =
                new ConcurrentHashMap<String, ThreadLocal<DateFormat>>();

        public static String format(String pattern, Date date){
            ThreadLocal<DateFormat> v = dfMap.get(pattern);
            if(v==null){
                v = new ThreadLocal<DateFormat>();
                synchronized (v){
                    SimpleDateFormat df = new SimpleDateFormat(pattern);
                    v.set(df);
                    dfMap.put(pattern, v);
                    return df.format(date);
                }
            }else{
                DateFormat df = v.get();
                synchronized (df){
                    return df.format(date);
                }
            }
        }
    }


    public static void main(String[] args){
        for(int j=0; j < 100; j++){
            for(int i=0; i < 100; i++){
                new Thread(){
                    @Override
                    public void run() {
                        System.out.println(new SafeDateFormat("mm:ss:SS").format(new Date()));
                        try {Thread.sleep(100);} catch (InterruptedException ignored) {}
                    }
                }.start();
            }
            try {Thread.sleep(100);} catch (InterruptedException ignored) {}
        }
    }
}
