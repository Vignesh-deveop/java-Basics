package codeforwin;

public class LengthConveter {

	public static void main(String[] args) {
		
		int lengthCm=1000;
		 
		int meter=(1000*1/100);       /*100cm=1m      
		
		      bodmas
		      b-bractek()
		      o-exponent(^)
		      d-divide/
		      m-multipliy
		      a-addition
		      s-sub    
		                                                     
		                                1m/100cm       
		                                1000cm*1m/100cm         
		                                 10 m*/      
		
		float kilometer=(10/1000);      /*1000m=1km
		
                                        1km/1000m       
                                        10m*1km/1000m         
                                         0.01km*/
		
		System.out.println("Length in meter ="+ meter +" meter");
		
		System.out.println("Length in kilo meter ="+ kilometer +" kilometer");
		
		

	}

}
