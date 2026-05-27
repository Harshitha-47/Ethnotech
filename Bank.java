class Bankbal{
	private int balance;
	public void setId(int i){
		balance=i;
	}
	public int getId(){
		return balance;
	}
}
public class Bank{
	public static void main(String args[])
	{
		Bankbal b=new Bankbal();
		b.setId(10000);
		System.out.print("Balance: "+b.getId());
	}
}