# shiyan3
shiyan3
一、实验目的

    初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
    掌握面向对象的类设计方法（属性、方法）；
    掌握类的继承用法，通过构造方法实例化对象；
    学会使用super()，用于实例化子类；
    掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。

# 二、实验要求
学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。
对象示例：	人员（编号、姓名、性别……）
教师（编号、姓名、性别、所授课程、……）
学生（编号、姓名、性别、所选课程、……）
课程（编号、课程名称、上课地点、时间、授课教师、……）
##### 1.编写上述实体类以及测试主类（注意类之间继承关系的适用）
##### 2.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）；模拟学生退课操作，再打印课程信息。

三、实验方法

实验课堂上讲基本的架构基本功能进行实现，课后结合资料与人讨论完善系统，期间对每个重要版本进行保存。尽可能去尝试新的东西，在运用的过程中发现程序的bug或者是程序逻辑上的不完整的地方，尽力去除bug，完善逻辑。解决bug的一般方法是，语法错误则读提示，查相关语法资料，逻辑bug则可以设置断点，或者分模块调试。程序的逻辑不完善则需要重新构思，新模块的实现方法和与老模块的兼容性。

四、流程图 https://github.com/Wanghongbo0633/shiyan3/blob/main/2.jpg

五、核心代码
package shiyan3;
import java.util.Scanner;

public class Test {
	static void cls(){
		System.out.println("\n\n\n\n\n\n");
	}
public static void main(String[] args) {
	Teacher you= new Teacher("游煦",201002,"男");
	Course math = new Course("01","高数","教学楼101","周一第一节",you);
	Course english = new Course("02","视听说","图书馆503","周二第三节",you);
    Scanner sc = new Scanner(System.in);

	Student li = new Student(2019311,"LYL");
	System.out.println("老师基本信息"+you);
	li.getcourse(math);
	li.getcourse(english);
    int i = 1;
    System.out.println("进入选课系统：");
    while(i != 0){
	    System.out.println("请选择：\n1：选课    2：退课   3：显示已选   0：退出");

		i = sc.nextInt();
		sc.nextLine();     //抛弃剩下内容便于下次调用nextLine
		if(i == 1){
			cls();
			System.out.println("目前课程：01 高数;02 视听说 \n 	请选择：");
			String i1 = sc.nextLine();
			if(i1.equals("01")){
                 li.xuanke(1);
                 System.out.println("选课成功");
			}
			else if(i1.equals("02")){
				li.xuanke(2);
				System.out.println("选课成功");
			}
            else System.out.println("暂无此选课，返回上级");
		}
		else if(i == 2){
			cls();
			System.out.println("目前课程：01 高数;02 视听说 \n 	请选择：");
			String i1 = sc.nextLine();
			if(i1.equals("01")){
				li.tuike(1);
			}
			else if(i1.equals("02")){
				li.tuike(2);
			}
			else System.out.println("暂无此选课,无法退课，返回上级");
		}

        else if(i == 3){
			li.showall();
		}
        System.out.println("课程信息已更新");
    }


	//math.show();

	
}
}

六、实验结果
https://github.com/Wanghongbo0633/shiyan3/blob/main/1.PNG

七、实验感想
对父类与子类的理解，对于继承的使用更深刻了，学会了使用tostring方法。
