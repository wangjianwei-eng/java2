package xuankexitong;

public class Teacher extends Person {
	private Course course;

//初始化一个教师对象
	public Teacher(int id, String name, String gender) {
		super(id, name, gender);
	}

//获得所授课程对象
	public Course getCourse() {
		return course;
	}

//设置所授课程对象
	public void setCourse(Course course) {
		this.course = course;
	}

	public String toString() {
		return getName();
	}
}
