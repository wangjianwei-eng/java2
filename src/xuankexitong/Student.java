package xuankexitong;

public class Student extends Person {
	private Course selectCourse;

//����һ��ѧ������
	public Student(int id, String name, String gender) {
		super(id, name, gender);
		// TODO Auto-generated constructor stub
	}

//���ѧ����ѡ�γ̶���
	public Course getSelectCourse() {
		return selectCourse;
	}

//����ѧ����ѡ�γ̶���
	public void setSelectCourse(Course selectCourse) {
		this.selectCourse = selectCourse;
	}

	public void selectclass(Course c) {
		if (selectCourse != null) {
			System.out.println(getName()+" ִ��ѡ�� "+getSelectCourse().getCourseName()+ " ��ѡ�γ̣���Ҫ���˿�!\n");
//			selectCourse.rmStudent(this);
			this.rmclass();
		}
		if (c.addStudent(this)) {
			this.selectCourse = c;
			System.out.println(getName()+ " ִ��ѡ�� "+getSelectCourse().getCourseName()+  " ѡ�γɹ���\n");
		} else {
			System.out.println(getName()+ " ִ��ѡ�� "+getSelectCourse().getCourseName()+  " ѡ�γɹ���\n");
		}
	}
//����ѧ���˿ζ���
	public void rmclass() {
		if (selectCourse == null) {
			System.out.println(getName()+ " ִ���˿� "+" �˿�ʧ�ܣ�");
		} else {
			selectCourse.rmStudent(this);
			selectCourse = null;
			System.out.println(getName()+ " ִ���˿� "+ " �˿γɹ���");
		}
	}

	public String toString() {
		return getName();
	}
}
