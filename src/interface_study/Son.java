package interface_study;

public class Son implements Father,Mother{

	public static void main(String[] args) 
	{
		Son s=new Son();
		s.nature();
		s.love();
		s.money();
		s.rules();

	}

	@Override
	public void nature() 
	{
		System.out.println("Mothers nature completed in Son's Class");
	}

	@Override
	public void love()
	{
		System.out.println("Mothers love completed in Son's Class");
	}

	@Override
	public void money() 
	{
		System.out.println("Fathers money completed in Son's Class");
	}

	@Override
	public void rules() 
	{
		System.out.println("Fathers rules completed in Son's Class");
	}

}
