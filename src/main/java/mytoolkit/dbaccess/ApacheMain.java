package mytoolkit.dbaccess;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * User: john
 * Date: Oct 13, 2010
 * Time: 10:50:28 PM
 */
public class ApacheMain {
    public static void main(String[] args) {
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://127.0.0.1/labs?useUnicode=true&amp;characterEncoding=utf-8&amp;autoReconnect=true");
        ds.setUsername("labs");
        ds.setPassword("labs");

        QueryRunner run = new QueryRunner(ds);
        // Execute the query and get the results back from the handler
        try {
            List<Map<String, Object>> results = run.query("SELECT id,name FROM features", new MapListHandler());
            for(Map<String,Object> row: results){
                for(Map.Entry entry: row.entrySet()){
                    System.out.print(entry.getKey()+": "+entry.getValue());
                }
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
