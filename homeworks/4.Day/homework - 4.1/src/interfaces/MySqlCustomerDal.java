package interfaces;

public class MySqlCustomerDal implements ICustomerDal,IRepository{ 
	//bir class birden fazla interface'i implemente edebilir
	//bir class sadece bir tane class'ý extend ede bilir

	@Override
	public void add() {
		System.out.println("My Sql eklendi");
		
	}

}
