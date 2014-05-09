// ***************************************************************
//   LazyDays.java
//
//   Program will prompt a user to enter the current 
//   day's temperature, and then suggest an appropriate
//   activity at camp Lazy Days
// ***************************************************************

import static java.lang.System.out;

public class LazyDays
{
   public static void main (String[] args)
   {
	   int temp = 0;
       Boolean Valid_Temp = true;     // You might need this - or find another way 
       String activity = null;
       String builder = ""; 

       temp = GetInfo.getInt("What is the current temperature outside today? ");

		if(temp >= 80){
			activity = "swimming";
		}else if(temp>=60 && temp < 80){
			activity = "play tennis";
		}else if(temp>=40 && temp<60){
			activity = "golfing";
		}else if(temp<40){
			activity = "skiing";
		}
		if(temp < 20 || temp > 95)
			Valid_Temp = false;
		
		if(!Valid_Temp)
			builder+=("You should visit our shops.\n");
		builder+=("We suggest that you go " + activity);	
		
		GetInfo.showMessage(builder);

    }
}
