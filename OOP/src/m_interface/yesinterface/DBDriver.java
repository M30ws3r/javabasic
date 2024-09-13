package m_interface.yesinterface;

//기능 필요 유무에 따라
// 기능 필요(공통기능) : abstract
// 기능 불필요		   : interface (100% 추상화. 하고싶은 대로)
public interface DBDriver{ //추상 없어도 자동으로 abstract 들어옴
	public void connect(); //자동으로 public 들어오지만은 기술해 놓는 것이 명확함.
	public void insert();  //overriding 시에 무조건 public임.
}