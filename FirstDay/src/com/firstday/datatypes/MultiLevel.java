package com.firstday.datatypes;


class  Dadaji{
	
	  void Scooter() {
		  
		  System.out.println("Honda");
	  }
		
	}
	
	class Papa extends Dadaji{
		
		void Car() {
			
			System.out.println("BMW");
		}
		
	}
	class Sun extends Papa{
		
		void Bike() {
			
			System.out.println("Ninja H2r"); 
		}
	}
public class MultiLevel {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sun s=new Sun();
		s.Scooter();
		s.Car();
		s.Bike();
		
		
		
		
	    
	       
	       
	    
	        
	        
	        
		
		
	
	}

}
