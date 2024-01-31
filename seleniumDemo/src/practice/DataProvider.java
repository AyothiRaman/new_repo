package practice;

import org.testng.annotations.Test;

public class DataProvider {
	
	@Test(dataProvider = "giveData")
	public void dataProvider(String userName,String password) {
		System.out.println("your user Name is:"+ userName);
		System.out.println("your password is:"+ password);

	}
	
	@org.testng.annotations.DataProvider
	public Object[][] giveData(){
		
		Object[][] data = new Object[3][2];
		
		//for row 1
		data[0][0]="user1";
		data[0][1]="password1";
		
		//for row 2
		data[1][0]="user2";
		data[1][1]="password2";
		
		//for row 3
		data[2][0]="user3";
		data[2][1]="password3";
		return data;
		
	}

}
