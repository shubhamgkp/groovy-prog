package assignments

class ChildConstructor extends ParentConstructor {
	
		
	public ChildConstructor(){
		this(40)	
		println "Child Default constructor!"
	}
	
	public ChildConstructor(def a){
		this(20,25)
		println "Child One parameter constructor!"
	}
	
	public ChildConstructor(def a, def b){		
		super(15)
		println "Child Two parameter constructor!"
	}
	
	public static void main(String[] args){
		
		def ref = new ChildConstructor();
	} 

}
