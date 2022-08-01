class Eclipse extends Thread
{
	public void run()
	{
		System.out.println("Eclipse Thread" + " " +Thread.currentThread().getId());
	}
}
class PPT extends Thread
{
	public void run()
	{
		System.out.println("ppt thread" + " " +Thread.currentThread().getId());
	}
}
public class MultiThread {
	public static void main(String[] args)
	{
		Eclipse obj = new Eclipse();
		obj.start();
		PPT obj1 = new PPT();
		obj1.start();
	}
}
