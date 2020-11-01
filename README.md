# 实验三 学生模拟选课系统
## 一、实验目的 
* 初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法； 
* 掌握面向对象的类设计方法（属性、方法）； 掌握类的继承用法，通过构造方法实例化对象； 
* 学会使用super()，用于实例化子类； 
* 掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。 
# 二、实验要求
* 说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。
* 人员：编号、姓名、性别、课程
* 教师：编号、姓名、性别、所授课程
* 学生：编号、姓名、性别、所选课程
* 课程：课程编号、课程名称、上课时间、课程地点、教课教师、学分
# 三、实验方法
* 1、首先，设置了五个类，分别为：Test主类、Person人员类、Teacher教师类、Test入口类，并将Staff人员类设置为父类、将Teacher类和Student类设置为继承父类的子类。
* 结构设计
* package:shiyan2
* package xuankexitong
* class:Course课程类
* class:person人员类
* class:Teacher教师类
* class:Test入口类
* 2、在person父类里设置编号、姓名、性别这三个属性，再设置这些属性的get、set方法，接着设置有参构造方法，再对当前类中设置的属性调用当前对象。
* 3、在Teacher类里设置所授课程属性，再设置这个属性的get、set方法，再设置有参构造方法，用super语句继承父类Person中子类与父类相同的属性。 再对当前类中设置的属性调用当前对象，最后用tostring方法将所设置的这些属性进行输出。
* 4、在Student类里设置所选课程属性，再设置这些属性的get、set方法，接着设置有参构造方法，用super语句继承父类Person中子类与父类相同的属性。再对当前类中设置的属性调用当前对象。设置退课、选课不成功的judge方法，用if、else进行判断，最后用tostring方法将所设置的这些属性进行输出。
* 5、在Course课程类里设置课程编号、课程名称、上课时间、课程地点、教课教师以及学分这些属性，再设置这些属性的get、set方法，接着设置有参构造方法，再对当前类中设置的属性调用当前对象。最后用tostring方法将所设置的这些属性进行输出。
* 6、在Test主类先对Teacher、Course、Student按照所设置有参的顺序进行赋值，将course对象里的内容赋值给student的setCourse方法，将student对象里的内容赋值给teacher的sett1方法。定义course类型的course，让其与course相关联，定义Teacher类型的t1，让其与teacher相关联。定义main属性，让其与course类相关联，输出课程信息。 

## 实验流程图
* 选课流程

![2](https://github.com/wangjianwei-eng/java2/blob/main/src/%E9%80%89%E8%AF%BE%E6%B5%81%E7%A8%8B.png)
* 退课流程

![3](https://github.com/wangjianwei-eng/java2/blob/main/src/%E9%80%80%E8%AF%BE%E6%B5%81%E7%A8%8B.png)
## 核心代码
### 选课部分代码
```java
public boolean addStudent(Student stu) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = stu;
				return true;
			}

		}
		return false;
	}
 ```
### 退课部分代码
```java
	public boolean rmStudent(Student stu) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == stu) {
				students[i] = null;
				return true;
			}
		}
		return false;
	}
 ```
# 四、实验结果
![1](https://github.com/wangjianwei-eng/java2/blob/main/src/%E6%8D%95%E8%8E%B7.JPG)
# 五、实验感想
* 通过这次实验掌握了类的继承用法，通过构造方法实例化对象，当有多个相似的类结构时使用类的继承，将重复的代码提取到父类，可以减少代码的重复性，学会了toString()的使用方法。
