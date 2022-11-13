package btl.com;

import java.text.ParseException;

public class specialEmployee extends Employees {
	private Salary s;
	private static final double basicSalary = 2000000;
	private double factor;
	private double bonus;
	/**
	 * 
	 * @param employeeCode:Mã nhân viên
	 * @param date: Ngày sinh của nhân viên
	 * @param fullName: Họ Tên của nhân viên
	 * @param email: Email của nhân viên
	 * @param gender: Gioi tính nhân viên
	 * @param typeEmployee: loại nhân viên
	 * @param factor: Hệ số lương
	 * @throws ParseException
	 */
	public specialEmployee(String employeeCode, String date, String fullName, String email, String gender, Salary typeEmployee, double factor)throws ParseException {
		super(employeeCode, date, fullName, email, gender);
		this.s = typeEmployee;
		this.factor = factor;
		this.bonus = bonus;
	}
	

	@Override
	public double calculateWages() {
		
		return this.s.calculateWages(basicSalary, this.factor, this.bonus);
	}

}
