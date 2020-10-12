import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.IOException;

public class calculate {
public static int itr = 0;
	public static void calcDailyRange(ArrayList<Double> arr1, ArrayList<Double> arr2) throws IOException {
		int i=0;
	
		String SAMPLE_CSV_FILE = System.getProperty("user.dir")+"//"+itr+"CSV_Assignment.csv";
		itr++;
		BufferedWriter writer = Files.newBufferedWriter(Paths.get(SAMPLE_CSV_FILE));
		 CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
                 .withHeader("Daily_Range"+i));
		 
		for(i=0; i<arr1.size(); i++)
		{
		arr1.set(i,arr1.get(i)-arr2.get(i));
		csvPrinter.printRecord(arr1.get(i));
		
		}
		System.out.println("Substracting high-low and saving in CSV_Assignment.csv");
		
	}
	
}
