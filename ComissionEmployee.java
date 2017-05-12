
public class EmployeeClass2 {

	public static void main(String[] args) {
		CommissionEmployee employee = new CommissionEmployee();

		System.out.println("Employee information obtained by method: \n");
		System.out.printf("%s %s \n", "First name is ", employee.getFirstName());
		System.out.printf("%s %s \n", "First name is ", employee.getLastName());
		System.out.printf("%s %s \n", "Social security is ", employee.getSocialSecurity());
		System.out.printf("%s %s \n", "Gross sales is ", employee.getGrossSales());
		System.out.printf("%s %s \n", "Comission rate is ", employee.getCommissionRate());
		employee.setGrossSales(500);
		employee.setComissionRate(.1);

		System.out.printf("\n%s:\n\n%s\n", "update employee information obtained by toString", employee);

	}

}

=============================================================================================================================

public class CommissionEmployee {

	public Object getFirstName() {
		System.out.println("Kiefer");
		return null;
	}

	public Object getLastName() {
		System.out.println("Vu");
		return null;
	}

	public Object getSocialSecurity() {
		System.out.println("222-22-2222");
		return null;
	}

	public Object getGrossSales() {
		System.out.println("1000");
		return null;
	}

	public Object getCommissionRate() {
		System.out.println(".06");
		return null;
	}

	public void setGrossSales() {
		int sales = 500;

	}

	public void setGrossSales(int i) {
		i = 500;

	}

	public void setComissionRate(double d) {
		d = .1;

	}

}
