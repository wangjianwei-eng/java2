package xuankexitong;

public class Teacher extends Person {
	private Course course;

//��ʼ��һ����ʦ����
	public Teacher(int id, String name, String gender) {
		super(id, name, gender);
	}

//������ڿγ̶���
	public Course getCourse() {
		return course;
	}

//�������ڿγ̶���
	public void setCourse(Course course) {
		this.course = course;
	}

	public String toString() {
		return getName();
	}
}
