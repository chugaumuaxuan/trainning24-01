package Object;

public class Object {
	
		 private String name;
		    public Object(String name){
		        this.name = name;
		        
		    }
		    public String getName(){
		        return name;
		    }
		    public void setName(String name){
		        this.name = name;
		    }

		    public static void main(String[] args) {
		    	Object obj1 = new Object("ABC");
		    	Object obj2 = obj1;
		    	
		    	obj2.setName("CDE"); //obj2 se tro den vi tri cua obj1 va thay the no
		    	
		    	System.out.println("Object 1: " + obj1.getName());
		    	System.out.println("Object 2: " + obj2.getName());
		    }
		    
}
