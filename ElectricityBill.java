class ElectricityBill{
	public static void main(String args[])
	{
		int n=300;
		if(n<250){
			System.out.print("No electricity bill");
		}
		else{
			System.out.print("Bill is :"+(n-250));
		}
	}
}