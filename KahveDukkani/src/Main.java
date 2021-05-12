
public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1234, "Nasim", "Anwari", "1999", "998998"));
		
	}
}
