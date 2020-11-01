package xuankexitong;

public class Person {
	private int id; // 编号
	private String name;// 姓名
	private String gender;// 性别

//全参构造方法
	public Person(int id, String name, String gender) {
		this.id = id;// 人员编号
		this.name = name;// 人员姓名
		this.gender = gender;// 人员性别
	}

//获得人员编号
	public int getId() {
		return id;
	}

//设置人员编号
	public void setId(int id) {
		this.id = id;
	}

//获得人员姓名
	public String getName() {
		return name;
	}

//设置人员姓名
	public void setName(String name) {
		this.name = name;
	}

//获得人员性别
	public String getGender() {
		return gender;
	}

//设置人员性别
	public void setGender(String gender) {
		this.gender = gender;
	}

}
