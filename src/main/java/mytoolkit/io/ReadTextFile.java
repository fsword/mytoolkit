package mytoolkit.io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * User: john
 * Date: Oct 14, 2010
 * Time: 10:46:22 AM
 */
public class ReadTextFile {
    public static void main(String[] args) {
        
        File file = new File("/home/john/a.py");
        try {
            List lines = FileUtils.readLines(file, "UTF-8");
            for(Object obj: lines){
                System.out.println(obj);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        try {
//            System.out.println(FileUtils.readFileToString(file));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
