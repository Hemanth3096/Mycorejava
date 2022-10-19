class Test
{
	void swap(int x, int y)
	{
		int temp;
		temp = x;
		x = y;
		y = temp;
	}
}
class Demo1 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		Test t = new Test();
		
		System.out.println("before swapping:");
		System.out.println("the value of a is :" + a);// 10
		System.out.println("the value of b is :" + b);// 20
		
		t.swap(a,b);
		System.out.println("after swapping:");
		System.out.println("the value of a is :" + a); // 20
		System.out.println("the value of b is :" + b);// 10
	}
}