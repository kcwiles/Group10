import java.util.Date;
import java.text.SimpleDateFormat;
public class dailyRecord {
	Date date;
	SimpleDateFormat format;
	String recordDate;
	HealthRecord record1;
	FitnessRecord record2;
	
	dailyRecord(){
		record1 = new HealthRecord();
		record2 = new FitnessRecord();
		date = new Date();
		format = new SimpleDateFormat("MMddyyyy");
		recordDate = format.format(date);
	}
	HealthRecord getHealth(){
		return record1;
	}
	FitnessRecord getFitness(){
		return record2;
	}
	String getDate(){
		return recordDate;
	}
	Date returnDate(){
		return date;
	}
	String getDateSummary(){
		SimpleDateFormat format1 = new SimpleDateFormat("MM/dd/yy");
		return format1.format(date);
	}
	
}
