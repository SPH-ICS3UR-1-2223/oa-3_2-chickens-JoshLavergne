public class Chickens02 {
    public static void main(String[] args) {
        //Put your code here
    	
    	// Starting & Variables /*
    	
    	double dailyAverage = 0;
    	int eggCount = 0;
    	double monthlyAverage = 0;
    	double monthlyProfit = 0;

    	// Monday /*
    	
    	eggCount+= 100;
    	
    	// Tuesday /*
    	
    	eggCount+= 121;
    	
    	// Wednesday /*
    	
    	eggCount+= 117;
    	
    	dailyAverage = eggCount/3.0;
    	
        System.out.println("Daily Average:   " +dailyAverage);
       
        monthlyAverage = dailyAverage*30;
        
        System.out.println("Monthly Average: " +monthlyAverage);
        
        monthlyProfit = monthlyAverage*0.18;
        
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
