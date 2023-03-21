import java.io.IOException;
import java.sql.SQLException;

public class DataBaseQueryServiceTest {
    public static void main(String[] args) throws SQLException, IOException {
        System.out.println("findMaxProjectsClient().toString() = " + DatabaseQueryService.findMaxProjectsClient());
        System.out.println("findLongestProject() = " + DatabaseQueryService.findLongestProject());
        System.out.println("findMaxSalaryWorker() = " + DatabaseQueryService.findMaxSalaryWorker());
        System.out.println("findYoungestOldestWorkers() = " + DatabaseQueryService.findYoungestOldestWorkers());
        System.out.println("printProjectPrices() = " + DatabaseQueryService.printProjectPrices());
    }
}
