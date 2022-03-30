package abstraction;
interface Shape
{
	void display();
	
}
class Rectangle implements Shape
{
	Rectangle()
	{
		System.out.println("the Rectangle class is called");
	}
	public void display()
	{
	System.out.println("This is a rectangle");
	}
}
class Triangle implements Shape
{
	Triangle()
	{
		System.out.println("The Triangle class is called");
	}
	public void display()
	{
		System.out.println("This is a Triangle");
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		Shape s=null;
		s=new Rectangle();
		s.display();
		s=new Triangle();
		s.display();
	}

}
