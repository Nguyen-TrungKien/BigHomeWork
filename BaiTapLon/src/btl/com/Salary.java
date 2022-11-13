package btl.com;

public enum Salary {
	
			Programmer{

				@Override
				public double calculateWages(double basicSalary, double factor, double bonus) {
					
					return basicSalary*factor+bonus*25000;
				}
				
			},
			Designer{

				@Override
				public double calculateWages(double basicSalary, double factor, double bonus) {
					
					return basicSalary*factor+bonus;
				}

			},
			Tester{

				

				@Override
				public double calculateWages(double basicSalary, double factor, double bonus) {
					
					return basicSalary*factor + bonus*200000 ;
				}
				
			},
			NormalEmployee{

				@Override
				public double calculateWages(double basicSalary, double factor, double bonus) {
					
					return  basicSalary*factor;
				}
				
			};
			
			

			public abstract double calculateWages(double basicSalary, double factor, double bonus);
				
			
}
