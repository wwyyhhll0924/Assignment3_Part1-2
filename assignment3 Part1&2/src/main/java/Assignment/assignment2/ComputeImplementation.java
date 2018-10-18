package Assignment.assignment2;

public class ComputeImplementation implements Interface{
	
	Interface obj;
	
	public double computeTax(int amount) {
		// TODO Auto-generated method stub
		return obj.computeTax(amount);
	}

	public double weeklySalary(Employee income) {
		// TODO Auto-generated method stub
		return obj.weeklySalary(income);
	}

	public double fortnightSalary(Employee income) {
		// TODO Auto-generated method stub
		return obj.fortnightSalary(income);
		
	}

	public double computeKiwiSaver(Employee kiwiOption) {
		// TODO Auto-generated method stub
		return obj.computeKiwiSaver(kiwiOption);
	}

}
