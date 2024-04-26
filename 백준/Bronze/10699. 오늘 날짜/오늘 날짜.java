import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        System.out.println(sdf.format(timestamp));
    }
}
