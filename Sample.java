//Scope of the variables with this keyword.

class Sample{
	static int x=1;
	private int y=2;
	public void fun(int x){
		Sample s = new Sample();
		this.x=10;
		y=20;
		System.out.println("x: "+x);
		System.out.println("this.x: "+Sample.x);
		System.out.println("y: "+y);
		System.out.println("s.y: "+s.y);
	}
	public static void main(String args[]){
		Sample s = new Sample();
		s.fun(5);
	}
}