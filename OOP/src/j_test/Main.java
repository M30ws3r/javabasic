package j_test;

public class Main {

	public static void main(String[] args) {
		
		ComputerStudent cs = new ComputerStudent();
		//cs.name = "홍길동";
		cs.setname("홍길동");
		
		Colleage cs2 = new ComputerStudent("홍가네");
		cs2.checkCollege();
	}
}