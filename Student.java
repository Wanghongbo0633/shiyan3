package shiyan3;

public class Student extends people {
	int bianhao;
	String name;
	//      int course[];
	Course course[] = new Course[20];
	int xuanke[]= new int[20];
	void xuanke(int x){
		xuanke[x] = 1;
	}
	void tuike(int x) {
		if(xuanke[x] == 1)
		{
			xuanke[x]=0;
		    System.out.println("�˿γɹ�");
		}
		else{
			System.out.println("δѡ�˿Σ������˿�");
		}
	}

	void showall(){
		for(int i=0;i<=19;i++){
			if(xuanke[i] == 1 && course[i] != null){
				System.out.println("��ѡ��"+course[i]);
			}
		}
	}
	public String toString() {
		return name+"  ��ţ�"+bianhao;
	}
    Student(int bianhao,String name,String sex)
	{
		super(bianhao,name,sex);
	}
	Student(int bianhao, String name) {
		this.bianhao = bianhao;
		this.name = name;
	}
	void getcourse(Course cour){
		course[cour.getbianhao()]=cour;
		System.out.println("����γ���Ϣ"+course[cour.getbianhao()]);
	}


//	void showall() {
//		if(course==null)
//		{System.out.println("ѧ��Ŀǰδѡ��");}
//		else {
//			System.out.println("ѧ����"+name);
//			for(int i=0;i<course.length;i++)
//			{System.out.println("ѡ��"+course[i]); }
//		}
//	}


//	void getcourse(Course  ...cour){
//		for(int i=0;i<cour.length;i++) {
//			course[cour[i].getbianhao()]=cour[i];
//
//		}
//	}



//	void tuike() {
//		course = null;
//	}
//	Student(int bianhao, String name) {
//		this.bianhao = bianhao;
//		this.name = name;
//		//Course[] courses = new Course[cour.length];
//		//System.out.println(course.length);
//		for (int i = 0; i < cour.length; i++) {
//			// System.out.println(course[i].name);
//			courses[i] = cour[i];
//			//System.out.println("ѡ��"+courses[i]);
//		}
//	    }
}