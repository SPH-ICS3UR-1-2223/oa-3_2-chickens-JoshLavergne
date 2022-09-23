public class Chickens01 {
    public static void main(String[] args) {
        //Put your code here
    	
    	//   Beginning & Variables  /*
    	
    	int totalEggs = 0;
        int chickenCount = 8;
        int eggsPerChicken = 4;
    
         //  Monday    /*

        totalEggs = eggsPerChicken * chickenCount;
        
        
        //  Tuesday    /*
        
        chickenCount++;
        totalEggs += eggsPerChicken * chickenCount;
        
        //  Wednesday    /*
        
        chickenCount /= 2;
        totalEggs += eggsPerChicken * chickenCount;
        
        System.out.println(totalEggs);
        
    }   
}
