public class NeroCustomerManager extends BaseCustomerManager{
	private CustomerCheckService _customerCheckService;
	
	public NeroCustomerManager(CustomerCheckService _customerCheckService) {
		super();
		this._customerCheckService = _customerCheckService;
	}
	public void save(Customer customer) {
		if(_customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Hata!!!");
		}
	}
	
}
