public class Main {
	public static void main(String[] args) {
		
		
	System.out.println("\t Today is Birthday of the Company!");
		Work[] workers = { new CEO(), 
						   new Manager(), new Manager(), new Developer(), 
						   new Developer(), new Developer(), new Developer(), 
						   new Specialist(), new Specialist(), new Specialist() };
		
		
		for (Work work: workers) {
			work.goToVacation();
		}
	}
}