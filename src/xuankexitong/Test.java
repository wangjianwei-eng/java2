package xuankexitong;

public class Test {
	public static void main(String[] args) {
		Student s1 = new Student(1001, "张三", "男");
		Student s2 = new Student(1002, "李四", "男");

		Teacher t1 = new Teacher(2001, "张老师", "男");
		Teacher t2 = new Teacher(2001, "李老师", "女");
//public Course(int courseId,String courseName,  Teacher teacher, String time, String room, float credit)
		Course c1 = new Course(101, "课程A", t1, "7:50-9:25", "#101", 3);
		Course c2 = new Course(101, "课程B", t2, "13:30-15:05", "#102", 2);

		s1.selectclass(c1);
		System.out.println(c1);

		System.out.println("============");

		s2.selectclass(c1);
		System.out.println(c1);

		System.out.println("============");

		s2.selectclass(c2);
		System.out.println(c1);
		s2.selectclass(c1);
		
		System.out.println(c2);

		System.out.println("============");
        s2.selectclass(c2);
		System.out.println(c1);
	}

}
