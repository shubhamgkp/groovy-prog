package assignments

class ParentConstructor {

	public ParentConstructor(){
		this(10,20)
		println "Parent Default constructor!"
	}
	
	public ParentConstructor(def a){
		this()
		println "Parent One parameter constructor!"
	}
	
	public ParentConstructor(def a, def b){
		
		println "Parent Two parameter constructor!"
	}
}
