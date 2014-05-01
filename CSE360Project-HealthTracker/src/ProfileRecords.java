import java.util.*;
public class ProfileRecords {
	dailyRecord e;
	LinkedList list;
	String weekTotals;
	
	ProfileRecords(){
		e = new dailyRecord();
		list = new LinkedList();
		list.add(e);
		//Still need to add a Daily record for the past month, and also it should be editable and accessable from the panel to user.
	}
	//getRecords(String start, String end){
		
	//}
	dailyRecord getDaily(){
		return e;
	}

	dailyRecord[] lastWeekRecords(){
		dailyRecord[] lastWeek = new dailyRecord[7];
		int i = 0;
		while(i != 7){
			//lastWeek[i];
			i++;
		}
		return lastWeek;
	}
}
