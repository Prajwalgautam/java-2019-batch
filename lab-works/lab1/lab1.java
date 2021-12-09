class Constructors{
	public Constructors(){
		System.out.println("Default Constructor");
	}
	public Constructors(String msg){
		System.out.println("Parameterized Constructor by:"+msg);
	}
	public static void main(String[] args){
		Constructors defaultConstructor = new Constructors("Prajwal");
	}	
}
