package developersKnow;


class AccountDetails{
	
	
	private int acctNo;
	private String holderName;
	private String location;
	
	
	public int getAcctNo() {
		return acctNo;
	}
	public void setAcctNo(int acctNo) {
		this.acctNo = acctNo;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}

public class Encapsulation {
	
	public static void main(String[] args) {
		
		AccountDetails act = new AccountDetails();
		
		act.setAcctNo(12345);
		act.setHolderName("Aspire");
		act.setLocation("tidel");
		
		
		System.out.println(act.getAcctNo()+" "+ act.getHolderName());
	}

}
