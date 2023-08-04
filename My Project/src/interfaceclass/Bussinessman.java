
package interfaceclass;



public class Bussinessman  implements RichMan, SocialWorker {

	@Override
	public void helpToOthers() {
	System.out.println("HelpToOthers");
	}

	@Override
	public void earnMoney() {
	System.out.println("Earnmoney");	
	}

	@Override
	public void party() {
	System.out.println("Party");
	}

	@Override
	public void donation() {
	System.out.println("Donation");
	} 

}
