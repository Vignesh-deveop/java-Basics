package codeforwin;

public class DiaCircumArea {  //  find diameter,circumference,area

	public static void main(String[] args) {
		
		int radius=10;
		
		double circumference=2*radius*3.14;  // formula c=2pi*r or c=d*3.14(pi)//  to find diameter is   radius * radius so  2*radius for diameter    
		
		 double area= 3.14*(radius*radius);   //  formula area=pir^2 //  to find area of circle
		
		System.out.println("Diameter =" +(2*radius)+" units");
		
		System.out.println("circumference =" +(circumference)+" units");
		
		System.out.println("Area =" +(area)+"sq. units");
		
		
	}
	
	
	
	
}
