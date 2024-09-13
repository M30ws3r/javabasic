package g_singleton;

public class DBConnect{
	
	private DBConnect(){ //다른데에서 못 갖다 쓰게 됨...
		System.out.println("실제 디비에 연결함");
	}
	
	private static DBConnect dbconn = null; //이 경우에만 null 생성하고, 이후에 100만번 불려져도 1번만 생성.
	
	public static DBConnect getInstance(){
		if( dbconn == null) dbconn = new DBConnect();
		return dbconn;
	}
}

//Calendar.getInstance() - static함수면서 Calendar 객체 넘겨주겠지?