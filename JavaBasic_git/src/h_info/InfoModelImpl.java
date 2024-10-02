package h_info;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InfoModelImpl {
	
	// 0. 필요한 변수 선언
	static String driver  = "oracle.jdbc.driver.OracleDriver";
	static String url	  = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	static String user	  = "seungmo1";
	static String pass	  = "ha";
	
	public InfoModelImpl() throws ClassNotFoundException {
		// 1. 드라이버 로딩
		Class.forName(driver);
	}
	
	public void deleteInfo(String tel) throws Exception{
		Connection con = null;
		PreparedStatement ps = null;
		
		// 2. SQL 문장
		String sql = "DELETE FROM info_tab WHERE tel=? ";
		
		try {
			// 3. 연결객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);
			
			ps = con.prepareStatement(sql);
			ps.setString(1, tel);
			
			// 5. 전송
			int res = ps.executeUpdate();
			if(res>0) {
				System.out.println("삭제 성공");
			}
		}finally{
			//6. 닫기
			con.close(); //exception 생기면 던져질 때 열어놓고 가면 안되니까.
			ps.close();
		}
	}
	
	// 전화번호를 입력받아 해당 고객정보를 디비에서 검색하여 InfoVO에서 지정하여 리턴
	public InfoVO selectInfoByTel(String tel) throws Exception{
		
		Connection con = null;
		PreparedStatement ps = null;
		
		InfoVO vo = new InfoVO();
		
		// 2. sql 문장
		String sql = "DELETE * FROM info_tab WHERE tel=?";		
		
		try {
			// [3] 연결객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);
						
			// [4] 전송객체 얻어오기
			ps = con.prepareStatement(sql);
			ps.setString(1, tel);
			
			// [5] 전송
			ResultSet rs = ps.executeQuery(); //결과를 줌.
			if(rs.next()) {
				vo.setName(rs.getString("name"));
				vo.setId(rs.getString("jumin"));
				vo.setTel(rs.getString("tel"));
				vo.setGender(rs.getString("gender"));
				vo.setAge(rs.getInt("age"));
				vo.setHome(rs.getString("home"));
			}
			
		}finally{
			// [6] 담기
			ps.close();
			con.close();
		}
		return vo;
	}
	
	//넘겨받은 InfoVO의 멤버값들을 디비에 입력
	public void insertInfo(InfoVO vo) throws Exception{
		Connection con = null;
		PreparedStatement ps = null;
		
		// 2. sql 문장
		String sql = "INSERT INTO "
				+ " info_tab( name, jumin, tel, age, gender, home, deptno) "
				+ " VALUES(?,?,?,?,?,?,10) ";
		
		try {
			// 3. 연결객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);
			
			// 4. 전송객체 얻어오기
			ps = con.prepareStatement(sql);
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getId());
			ps.setString(3, vo.getTel());
			ps.setInt(	 4, vo.getAge());
			ps.setString(5, vo.getGender());
			ps.setString(6, vo.getHome());
			
			// 5. 전송
			ps.executeUpdate();
			
		}finally {
			//6. 닫기
			con.close(); //exception 생기면 던져질 때 열어놓고 가면 안되니까.
			ps.close();
		}
	}
}
