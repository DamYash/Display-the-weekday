import java.util.Scanner;	
public class DisplayWeekDay {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int day;
		System.out.println("Enter the number: ");
		day = s.nextInt();
		
		System.out.println(getDayName(day));
	}
	public static String getDayName(int day)
	{
		String dayName = "";
		switch (day)
		{
		case 1: dayName = "Monday"; break;
		case 2: dayName = "Tuesday"; break;
		case 3: dayName = "Wednesday"; break;
		case 4: dayName = "Thursday"; break;
		case 5: dayName = "Friday"; break;
		case 6: dayName = "Saturday"; break;
		case 7: dayName = "Sunday"; break;
		default: dayName = "Invalid day";
		}
		return dayName;
	}
}


/** Output:
Enter the number: 
5
Friday
**/
