package shiyan3;

public class Teacher extends people{
    String name;
    int bianhao;
    Teacher(String name,int bianhao,String sex){
    	this.name=name;
    	this.bianhao = bianhao;
    	this.sex = sex;
    }
    public String toString() {
    	return "��ʦ������"+name+"  �Ա�"+sex+"  ��ţ�"+bianhao;
    }
}