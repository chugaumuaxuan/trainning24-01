package MutableClass;

public class Student {
	String name;
	
	Student(String name){
		this.name = name;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student("Thang");
		System.out.println("Ten sinh vien la " + st1.getName());
		
		
		//update khi su dung set method
		st1.setName("Duc Anh");
		System.out.println("Ten sinh vien la " + st1.getName());
		
	}

}
