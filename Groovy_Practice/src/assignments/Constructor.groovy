package assignments

class Constructor {
	
	public Constructor(){
		
		println "This is default constructor!"
	}
	public Constructor(def a){		
		this()
		println "This is single parameter constructor!"
	}	
	public Constructor(def a, def b){		
		this(20)
		println "This is double parmeter constructor!"
	}	
	public Constructor(def a, def b, def c){		
		this(34,30)
		println "This is triple parameter constructor!"
	}	
	public static void main(String[] args){
		
		def ref = new Constructor(10,20,20);
	}
}
