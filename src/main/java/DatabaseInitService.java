import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DatabaseInitService {
    public static void main(String[] args) throws IOException {

        Database database = Database.getInstance();
        String sql = String.join("\n",
                Files.readAllLines(Paths.get("sql/init_db.sql")));
        database.executeUpdate(sql);

    }
}
