package xuankexitong;

public class Course {
	private String courseName; // 课程
	private int courseId; // 编号
	private Teacher teacher;// 教课教师
	private float credit;// 学分
	private Student[] students;// 选课学生
	private String time;// 上课时间
	private String room;// 上课教室

// 初始化一门课程
	public Course(int courseId, String courseName, Teacher teacher, String time, String room, float credit) {
		super();
		this.courseName = courseName;
		this.courseId = courseId;
		this.teacher = teacher;
		teacher.setCourse(this);
		this.credit = credit;
		this.students = new Student[10];  //设置选课人数上限
		this.time = time;
		this.room = room;
	}

//获得课程名
	public String getCourseName() {
		return courseName;
	}

//设置课程名
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

//获得课程编号
	public int getCourseId() {
		return courseId;
	}


//设置课程编号
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
//获得教课教师
	public Teacher getTeacher() {
		return teacher;
	}
	
//设置教课教师
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

//设置学分
	public float getCredit() {
		return credit;
	}

//获得学分
	public void setCredit(float credit) {
		this.credit = credit;
	}
	
//获得选课学生
	public Student[] getStudents() {
		return students;
	}	
	
//设置选课学生
	public void setStudents(Student[] students) {
		this.students = students;
	}
	
//获得上课时间
	public String getTime() {
		return time;
	}
	
//设置上课时间
	public void setTime(String time) {
		this.time = time;
	}	

//获得上课教室
	public String getRoom() {
		return room;
	}

//设置上课教室
	public void setRoom(String room) {
		this.room = room;
	}

//添加学生到课程
	public boolean addStudent(Student stu) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = stu;
				return true;
			}

		}
		return false;
	}

//删除学生到课程
	public boolean rmStudent(Student stu) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == stu) {
				students[i] = null;
				return true;
			}
		}
		return false;
	}

//获得选课学生列表
	public String toString() {
		int studentsCount = students.length;
		return "课程信息 {" + 
				"课程编号:" + courseId + 
				"，课程名称:'" + courseName + '\'' + 
				"，所在教室:'" + room + '\''+ 
				"，上课时间:'" + time + '\'' + 
				"，授课教师:'" + teacher+ '\'' + 
				"，人数上限:'" + 10 + "'" + 
				"，学分:'" + credit
				+ '\'' + "}\n";
	}
}
