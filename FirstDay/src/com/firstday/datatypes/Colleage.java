package com.firstday.datatypes;

class Principal{
	
	void Notice() {
		
		System.out.println("Tommorow there will be a holiday to our colleage!");
	}
	
	
}

class HOD extends Principal{
	
	void Explor() {
		
		System.out.println("HOD Gives a notice to all the class teachers to implimate");
		
		
	}
	
	
}

class ClassTeacher extends HOD{
	
	void Impliment() {
		
		System.out.println("Class Teacher impliments the notice that the HOD gives to all vlass teachers");
	}
	
	
}

public class Colleage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassTeacher c=new ClassTeacher();
		c.Notice();
		c.Explor();
		c.Impliment();
		
		
		

	}

}
