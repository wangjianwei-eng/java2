package xuankexitong;

public class Student extends Person {
	private Course selectCourse;

//创建一个学生对象
	public Student(int id, String name, String gender) {
		super(id, name, gender);
		// TODO Auto-generated constructor stub
	}

//获得学生所选课程对象
	public Course getSelectCourse() {
		return selectCourse;
	}

//设置学生所选课程对象
	public void setSelectCourse(Course selectCourse) {
		this.selectCourse = selectCourse;
	}

	public void selectclass(Course c) {
		if (selectCourse != null) {
			System.out.println(getName()+" 执行选课 "+getSelectCourse().getCourseName()+ " 已选课程，需要先退课!\n");
//			selectCourse.rmStudent(this);
			this.rmclass();
		}
		if (c.addStudent(this)) {
			this.selectCourse = c;
			System.out.println(getName()+ " 执行选课 "+getSelectCourse().getCourseName()+  " 选课成功！\n");
		} else {
			System.out.println(getName()+ " 执行选课 "+getSelectCourse().getCourseName()+  " 选课成功！\n");
		}
	}
//设置学生退课对象
	public void rmclass() {
		if (selectCourse == null) {
			System.out.println(getName()+ " 执行退课 "+" 退课失败！");
		} else {
			selectCourse.rmStudent(this);
			selectCourse = null;
			System.out.println(getName()+ " 执行退课 "+ " 退课成功！");
		}
	}

	public String toString() {
		return getName();
	}
}
