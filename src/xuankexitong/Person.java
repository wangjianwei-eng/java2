package xuankexitong;

public class Person {
	private int id; // ���
	private String name;// ����
	private String gender;// �Ա�

//ȫ�ι��췽��
	public Person(int id, String name, String gender) {
		this.id = id;// ��Ա���
		this.name = name;// ��Ա����
		this.gender = gender;// ��Ա�Ա�
	}

//�����Ա���
	public int getId() {
		return id;
	}

//������Ա���
	public void setId(int id) {
		this.id = id;
	}

//�����Ա����
	public String getName() {
		return name;
	}

//������Ա����
	public void setName(String name) {
		this.name = name;
	}

//�����Ա�Ա�
	public String getGender() {
		return gender;
	}

//������Ա�Ա�
	public void setGender(String gender) {
		this.gender = gender;
	}

}
