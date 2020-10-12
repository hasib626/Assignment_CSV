import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.io.IOException;


public class CSVAssignment extends calculate {
	public static void main(String[] args) throws IOException {
		

		String myPath1 = System.getProperty("user.dir")+"//cm29JAN2020bhav.csv";
		String myPath2 = System.getProperty("user.dir")+"//cm30JAN2020bhav.csv";
		String myPath3 = System.getProperty("user.dir")+"//cm31JAN2020bhav.csv";	
		
		ArrayList<Double> high1 = new ArrayList<Double>(); 
		ArrayList<Double> high2 = new ArrayList<Double>();
		ArrayList<Double> high3 = new ArrayList<Double>();
		
		ArrayList<Double> Low1 = new ArrayList<Double>();
		ArrayList<Double> Low2 = new ArrayList<Double>();
		ArrayList<Double> Low3 = new ArrayList<Double>();
		
		Reader readerh1 = Files.newBufferedReader(Paths.get(myPath1));
		CSVParser csvParserh1 = new CSVParser(readerh1, CSVFormat.RFC4180.withFirstRecordAsHeader()
				.withHeader("SYMBOL","SERIES","OPEN","HIGH","LOW")
				.withIgnoreHeaderCase()
				.withTrim());

		for (CSVRecord csvRecord1 : csvParserh1) {
			double highVal = Double.parseDouble(csvRecord1.get("HIGH"));
			high1.add(highVal);
		}
		
		Reader readerL1 = Files.newBufferedReader(Paths.get(myPath1));
		CSVParser csvParserL1 = new CSVParser(readerL1, CSVFormat.RFC4180.withFirstRecordAsHeader()
				.withHeader("SYMBOL","SERIES","OPEN","HIGH","LOW")
				.withIgnoreHeaderCase()
				.withTrim());
		for (CSVRecord csvRecord1 : csvParserL1) {
			double lowVal = Double.parseDouble(csvRecord1.get("LOW"));
			Low1.add(lowVal);	
		}
		
		Reader readerh2 = Files.newBufferedReader(Paths.get(myPath2));
		CSVParser csvParserh2 = new CSVParser(readerh2, CSVFormat.RFC4180.withFirstRecordAsHeader()
				.withHeader("SYMBOL","SERIES","OPEN","HIGH","LOW")
				.withIgnoreHeaderCase()
				.withTrim());

		for (CSVRecord csvRecord2 : csvParserh2) {
			double highVal = Double.parseDouble(csvRecord2.get(3));
			high2.add(highVal);
		}
		
		Reader readerL2 = Files.newBufferedReader(Paths.get(myPath2));
		CSVParser csvParserL2 = new CSVParser(readerL2, CSVFormat.RFC4180.withFirstRecordAsHeader()
				.withHeader("SYMBOL","SERIES","OPEN","HIGH","LOW")
				.withIgnoreHeaderCase()
				.withTrim());
		
		for (CSVRecord csvRecord2 : csvParserL2) {
			double lowVal = Double.parseDouble(csvRecord2.get(4));
			Low2.add(lowVal);
		}

		Reader readerh3 = Files.newBufferedReader(Paths.get(myPath3));
		CSVParser csvParserh3 = new CSVParser(readerh3, CSVFormat.RFC4180.withFirstRecordAsHeader()
				.withHeader("SYMBOL","SERIES","OPEN","HIGH","LOW")
				.withIgnoreHeaderCase()
				.withTrim());

		for (CSVRecord csvRecord3 : csvParserh3) {
			double highVal = Double.parseDouble(csvRecord3.get(3));
			high3.add(highVal);
		}
		
		Reader readerL3 = Files.newBufferedReader(Paths.get(myPath3));
		CSVParser csvParserL3 = new CSVParser(readerL3, CSVFormat.RFC4180.withFirstRecordAsHeader()
				.withHeader("SYMBOL","SERIES","OPEN","HIGH","LOW")
				.withIgnoreHeaderCase()
				.withTrim());
		for (CSVRecord csvRecord3 : csvParserL3) {
			double lowVal = Double.parseDouble(csvRecord3.get(4));
			Low3.add(lowVal);
		}
		
		calculate.calcDailyRange(high1, Low1);
		calculate.calcDailyRange(high2, Low2);
		calculate.calcDailyRange(high3, Low3);
		
	}
	
}