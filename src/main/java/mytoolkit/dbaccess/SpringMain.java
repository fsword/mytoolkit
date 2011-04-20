package mytoolkit.dbaccess;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

/**
 * User: john
 * Date: Oct 13, 2010
 * Time: 10:50:18 PM
 */
public class SpringMain {
    public static void main(String[] args) {
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://127.0.0.1/labs?useUnicode=true&amp;characterEncoding=utf-8&amp;autoReconnect=true");
        ds.setUsername("labs");
        ds.setPassword("labs");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(ds);
        List list = jdbcTemplate.queryForList("SELECT id,name FROM features");
        for(Object obj: list){
            for(Map.Entry entry: ((Map<String,Object>)obj).entrySet()){
                System.out.print(entry.getKey()+": "+entry.getValue());
            }
            System.out.println();
        }
    }
}
