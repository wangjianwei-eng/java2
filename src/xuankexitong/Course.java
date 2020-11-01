package xuankexitong;

public class Course {
	private String courseName; // �γ�
	private int courseId; // ���
	private Teacher teacher;// �̿ν�ʦ
	private float credit;// ѧ��
	private Student[] students;// ѡ��ѧ��
	private String time;// �Ͽ�ʱ��
	private String room;// �Ͽν���

// ��ʼ��һ�ſγ�
	public Course(int courseId, String courseName, Teacher teacher, String time, String room, float credit) {
		super();
		this.courseName = courseName;
		this.courseId = courseId;
		this.teacher = teacher;
		teacher.setCourse(this);
		this.credit = credit;
		this.students = new Student[10];  //����ѡ����������
		this.time = time;
		this.room = room;
	}

//��ÿγ���
	public String getCourseName() {
		return courseName;
	}

//���ÿγ���
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

//��ÿγ̱��
	public int getCourseId() {
		return courseId;
	}


//���ÿγ̱��
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
//��ý̿ν�ʦ
	public Teacher getTeacher() {
		return teacher;
	}
	
//���ý̿ν�ʦ
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

//����ѧ��
	public float getCredit() {
		return credit;
	}

//���ѧ��
	public void setCredit(float credit) {
		this.credit = credit;
	}
	
//���ѡ��ѧ��
	public Student[] getStudents() {
		return students;
	}	
	
//����ѡ��ѧ��
	public void setStudents(Student[] students) {
		this.students = students;
	}
	
//����Ͽ�ʱ��
	public String getTime() {
		return time;
	}
	
//�����Ͽ�ʱ��
	public void setTime(String time) {
		this.time = time;
	}	

//����Ͽν���
	public String getRoom() {
		return room;
	}

//�����Ͽν���
	public void setRoom(String room) {
		this.room = room;
	}

//���ѧ�����γ�
	public boolean addStudent(Student stu) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = stu;
				return true;
			}

		}
		return false;
	}

//ɾ��ѧ�����γ�
	public boolean rmStudent(Student stu) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == stu) {
				students[i] = null;
				return true;
			}
		}
		return false;
	}

//���ѡ��ѧ���б�
	public String toString() {
		int studentsCount = students.length;
		return "�γ���Ϣ {" + 
				"�γ̱��:" + courseId + 
				"���γ�����:'" + courseName + '\'' + 
				"�����ڽ���:'" + room + '\''+ 
				"���Ͽ�ʱ��:'" + time + '\'' + 
				"���ڿν�ʦ:'" + teacher+ '\'' + 
				"����������:'" + 10 + "'" + 
				"��ѧ��:'" + credit
				+ '\'' + "}\n";
	}
}
