package shiyan3;
import java.util.Scanner;

public class Test {
	static void cls(){
		System.out.println("\n\n\n\n\n\n");
	}
public static void main(String[] args) {
	Teacher you= new Teacher("����",201002,"��");
	Course math = new Course("01","����","��ѧ¥101","��һ��һ��",you);
	Course english = new Course("02","����˵","ͼ���503","�ܶ�������",you);
    Scanner sc = new Scanner(System.in);

	Student li = new Student(2019311,"LYL");
	System.out.println("��ʦ������Ϣ"+you);
	li.getcourse(math);
	li.getcourse(english);
    int i = 1;
    System.out.println("����ѡ��ϵͳ��");
    while(i != 0){
	    System.out.println("��ѡ��\n1��ѡ��    2���˿�   3����ʾ��ѡ   0���˳�");

		i = sc.nextInt();
		sc.nextLine();     //����ʣ�����ݱ����´ε���nextLine
		if(i == 1){
			cls();
			System.out.println("Ŀǰ�γ̣�01 ����;02 ����˵ \n 	��ѡ��");
			String i1 = sc.nextLine();
			if(i1.equals("01")){
                 li.xuanke(1);
                 System.out.println("ѡ�γɹ�");
			}
			else if(i1.equals("02")){
				li.xuanke(2);
				System.out.println("ѡ�γɹ�");
			}
            else System.out.println("���޴�ѡ�Σ������ϼ�");
		}
		else if(i == 2){
			cls();
			System.out.println("Ŀǰ�γ̣�01 ����;02 ����˵ \n 	��ѡ��");
			String i1 = sc.nextLine();
			if(i1.equals("01")){
				li.tuike(1);
			}
			else if(i1.equals("02")){
				li.tuike(2);
			}
			else System.out.println("���޴�ѡ��,�޷��˿Σ������ϼ�");
		}

        else if(i == 3){
			li.showall();
		}
        System.out.println("�γ���Ϣ�Ѹ���");
    }


	//math.show();

	
}
}
