package codeforwin;           
                                          /***************************************************/

public class meter {                    // divistion pannah kandipa f kudukahnum apo thaa  ans varahnum    
                                        // print statement la float value evalo print pannanum nu sollurom  
	public static void main(String[] args) {
		
		int lengthCm=1000;
		 
		float meter=(1000*1/100);       /*100cm=1m      
		
		     
		                                                     
		                                1m/100cm       
		                                1000cm*1m/100cm         
		                                 10 m*/      
		
		float kilometer= (10*(1/1000f)) ;         // divistion pannah kandipa f kudukahnum apo thaa  ans varahnum    
		                             /*1000m=1km
		                              1km/1000m       
                                        10m*1km/1000m         
                                         0.01km*/
		
		System.out.println("Length in meter ="+ meter +" meter");
		
		System.out.printf("Length in kilo meter  %.3fkm", kilometer );
		
		

	}

}
