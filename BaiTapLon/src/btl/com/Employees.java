package btl.com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public  class Employees {
	private String employeeCode;
	private Date date;
	private String fullName;
	private String email;
	private String gender;	
	public SimpleDateFormat F = new SimpleDateFormat("dd/MM/yyyy");
	
	public Employees ( String employeeCode, String date, String fullName, String email, String gender) throws ParseException {
		this.employeeCode = employeeCode;
		this.date = F.parse(date);
		this.fullName = fullName;
		this.email = email;
		this.gender = gender;
	}
	public  double calculateWages() {
		return 0;
	};
}
