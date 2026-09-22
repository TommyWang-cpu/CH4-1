public class FormatDate {
	
	public static void printAmerican(int day, String month, String date,
	 int year){
		System.out.println(day + "," + month + "," + date + "," + year);
	}
	
	public static void printEuropean(int day, String date, String month,
	 int year){
		System.out.println(day + "," + date + "," + month + "," + year);
	}
	
	public static void main(String[] arg){
	int day = 07;
	String date = "Friday";
	String month = "July";
	int year = 2010;
	
	printAmerican(day,month,date,year);
	printEuropean(day,date,month,year);
	}
}

	
