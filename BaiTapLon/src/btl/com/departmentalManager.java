package btl.com;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class departmentalManager extends Employees {
		private Date ngayNhamChuc;
		private Salary s;
		
		public departmentalManager(String employeeCode, String date, String fullName, String email, String gender, String ngayNhamChuc) throws ParseException {
			super( employeeCode,date,  fullName,  email, gender);
			this.ngayNhamChuc = F.parse(ngayNhamChuc);
		}

		@Override
		public double calculateWages() {
			
			return 0;
		}
}
