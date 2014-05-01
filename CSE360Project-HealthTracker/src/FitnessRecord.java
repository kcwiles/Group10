public class FitnessRecord {
	
	int cardio;
	int strength;
	int work;
	int sleep;
	int weight;
	
	FitnessRecord(){
		cardio = 0;
		strength = 0;
		work = 0;
		sleep = 0;
		weight = 0;
	}
	public String toString(){
		return "<html>" +cardio/60 + " Hours\t"+ cardio %60 + " Minutes<br><br>"
						+strength/60 + " Hours\t" + strength %60 +" Minutes<br><br>"
						+work/60 + " Hours\t" + work %60 + " Minutes<br><br>"
						+sleep/60 + " Hours\t" + sleep %60 + " Minutes<br><br>"
						+"<html>";	
	}
	public String toStringMins(){
		return "<html>" + cardio + " Mins<br><br>"
				+strength + " Mins<br><br>"
				+work/60 + " Mins<br><br>"
				+sleep/60 + " Mins<br><br>"
				+"<html>";
	}
	//public String toStringFile(){
	//	return cardio+strength+work+sleep;
	//}
	public int getCardio(){
		return cardio;
		
	}
	public int getStrength()
	{
		return strength;
		
	}
	public int getWork()
	{
		return work;
	}
	public int getSleep()
	{
		return sleep;
		
	}
	public int getWeight()
	{
		return weight;
		
	}
	public void changeCardioTime(int newTime)
	{
		cardio = newTime;
		
	}
	public void changeStrength(int newStrength)
	{
		strength = newStrength;
	}
	public void changeWork(int newWork)
	{
		work = newWork;
		
	}
	public void changeSleep(int newSleep)
	{
		sleep = newSleep;
		
	}
	public void changeWeight(int newWeight)
	{
		weight = newWeight;
	}
}