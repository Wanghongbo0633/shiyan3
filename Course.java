package shiyan3;

public class Course {
       String bianhao;
       String name;
       String dress;
       String time;
       Teacher teacher;
       Course(){
    	   
       }
       Course(String bianhao,String name,String dress,String time,Teacher teacher){
    	   this.bianhao=bianhao;
           this.name=name;
           this.dress=dress;
           this.time=time;
           this.teacher=teacher;
       }
       @Override
       public String toString() {
     	  return "���"+bianhao+"  �γ�����:"+name+"  �ڿε�ַ:"+dress+"  ʱ��:"+time+"  �ڿν�ʦ:"+teacher.name+"  �ڿ���ʦ���:"+teacher.bianhao;
}
       void show() {
    	   System.out.println("mingcheng"+name);
       }
       int getbianhao(){
           int x = Integer.parseInt(bianhao);
           return  x;
       }
}