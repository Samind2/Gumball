
public class GumballMachineTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GumballMachine gumballMachine = new GumballMachine(5);
		
		gumballMachine.ejectQuarter();
		gumballMachine.insertQuarter();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
		//gumballMachine.turnCrank();


	}


}

// thinking count = 3, state = noQuarterState

// You turned, but there's no quarter
// You need to pay first

//thinking count = 0, state = SoldOutState

//You turned, but there are no gumballs
//No gumball dispensed
