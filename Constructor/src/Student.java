
public class Student {
	
	String name;
	int roolNo ;
	Student(String name, int roolNo)
	{
		this.name=name;
		this.roolNo = roolNo;
		
	}
			
           public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 =new Student("suman" ,200);
		Student s2= new Student ("chiru",400);
		Student s3=new Student("anusha", 500);
		System.out.println(s1.name+"...."+s1.roolNo);
		System.out.println(s2.name+"...."+s2.roolNo);
		System.out.println(s3.name+"...."+s3.roolNo);

	}

}
