class AssertTest{
	public static void main(String args[]){
		int x=10;
		assert(x>5):"Sucssed";
		System.out.println("Invalid"+assert(x>5));
	
	}
}