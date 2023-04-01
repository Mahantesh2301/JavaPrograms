package numbers_logic;

public class Factors {
     public static void main(String[] args) {
		
    	 int no = 5;
    	 for(int i = 1; i<=no/2;i++)
    	 {
    		 if(no%i==0)
    		 {
    			 System.out.println(i +" is factor of "+no);
    		 }
    	 }
	}
}
