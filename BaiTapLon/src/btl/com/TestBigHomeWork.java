package btl.com;

import java.math.BigDecimal;
import java.text.ParseException;

public class TestBigHomeWork {

	public static void main(String[] args) throws ParseException {
//		Project p = new Project("DA21", "Dự án thiết kế web" , "10/11/2021", "10/11/2022", "Nguyen Trung Kien", new BigDecimal(100000000));
//		Project p1 = new Project("DA22", "Dự án thiết kế phần mền" , "10/11/2020", "10/11/2022", "Nguyen Trung Phong", new BigDecimal(200000000));
//		manageProject listProject = new manageProject();
//		
//		System.out.println("===== The project needs to be add into the project list =====");
//		listProject.addProject(p);
//		listProject.addProject(p1);
//		listProject.displayListProject();
//		System.out.println("===== The project needs to be removed from the project list =====");
//		listProject.deleteProject("Dự án thiết kế web");
//		System.out.println("===== project after removing from the list =====");
//		listProject.displayListProject();
//		
//		listProject.fixProject("DA22");
//		System.out.println("===== Project after fixing ======");
//		listProject.displayListProject();
		
		Employees nv = new specialEmployee("215", "24/15/2000", "Nguyễn Trung Kien", "trunqkien03@gmail.com", "Nam", Salary.NormalEmployee, 3);
		Employees nv1 = new specialEmployee("216", "24/16/2000", "Nguyễn Trung Phong", "trunqkien03@gmail.com", "Nam", Salary.Designer, 4);
		Employees nv2 = new specialEmployee("217", "24/17/2000", "Hồ Ngọc Nhung", "trunqkien03@gmail.com", "Nữ", Salary.Programmer, 5);
		System.out.println(" Tiền lương của các Nhân viên : " + nv.calculateWages());
		System.out.println("Tiên lương của các nhân viên: " + nv1.calculateWages());
	}

}
