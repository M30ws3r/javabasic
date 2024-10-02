package h_info;

// VO := DTO
public class InfoVO {
	
	private String name;
	private String id;
	private String tel;
	private int age;
	private String gender;
	private String home;
	
	// default constructor
	public InfoVO() {} //하는일 없어도 습관적으로 만들어주자...
	
	// 인자 있는 생성자 함수 만들어줘도 됨... 취향껏.
	
	// setter, getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}
	
}
