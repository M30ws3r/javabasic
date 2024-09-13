package exercise;

public class Human{
	//필드
	private String name;
	private int age;
	private int height;
	private int weight;
	
	public Human(String name, int age, int height, int weight){
		this.name 		= name		;
		this.age 		= age		;
		this.height  	= height 	;
		this.weight 	= weight	;
	}
	
//	public Human(String str){
//		String[] splitArray = str.split(" ");
//		this.name 		= splitArray[0];
//		this.age 		= splitArray[1];
//		this.height  	= splitArray[2];
//		this.weight 	= splitArray[3];
//	}
	
	//출력
	public String printInformation(){
		return (name+" "+age+"  "+height+"  "+weight);
	}
}