package exercise;

public class Student extends Human{
	//필드
	private String number;
	private String major;
	
	public Student(String name, int age, int height, int weight, String number, String major){
		super(name, age, height, weight);		
		this.number		= number;
		this.major 		= major;
	}
	
//	public Student(String str){
//		super(str);
//		String[] splitArray = str.split(" ");
//		this.number		= splitArray[4];
//		this.major 		= splitArray[5];
//	}
	
	public String printInformation(){
		return (super.printInformation()+"  "+number+"  "+major);
	}
}
