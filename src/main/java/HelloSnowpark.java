import com.snowflake.snowpark_java.*;
import java.util.HashMap;
import java.util.Map;

public class HelloSnowpark {
    public static void main(String[] args) {
        // Replace the <placeholders> below.
        Map<String, String> properties = new HashMap<>();
        properties.put("URL", "https://<account_identifier>.snowflakecomputing.com:443");
        properties.put("USER", "<user name>");
        properties.put("PASSWORD", "<password>");
        properties.put("ROLE", "<role name>");
        properties.put("WAREHOUSE", "<warehouse name>");
        properties.put("DB", "<database name>");
        properties.put("SCHEMA", "<schema name>");
        Session session = Session.builder().configs(properties).create();
        session.sql("show tables").show();
        
        session.close();
    }
}