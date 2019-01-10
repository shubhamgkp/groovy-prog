package groovyProg

class Groovy_2 {

	def a;
	
	public void demo(){
		
		println "Welcome Shubham!"
	}
	
	public static void main(String[] args){
		
		def ref = new Groovy_2()
		println ref.a=12;
		ref.demo();
	}
}
