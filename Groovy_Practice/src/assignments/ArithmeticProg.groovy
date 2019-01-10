package assignments

class ArithmeticProg {

	public def sum(def a, def b){
		
		def c=a+b
		return c
	}	
	public def sub(def x, def y){		
		def z=x-y
		return z
	}	
	public def sum2(def m, def n){		
		def p=m+n
		return p
	}	
	public def mul(def s, def t){		
		def u=s*t
		return u
	}
	public void div(def g, def h){		
		def i=g/h
		println "Final result = "+i		
	}	
	public static void main(String[] args){
		
		def ref = new ArithmeticProg()
		def res_sum = ref.sum(10,2)
		def res_sub = ref.sub(res_sum,2)
		def res_sum2 = ref.sum2(res_sub,2)
		def res_mul = ref.mul(res_sum2,2)
		ref.div(res_mul,2)
	}
}
