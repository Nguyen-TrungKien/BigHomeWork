package btl.com;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Project {
		private String projectCode;
		private String nameProject;
		private Date startTime;
		private Date endTime;
		private String managerProject;
		private BigDecimal totalCost;
		public static final SimpleDateFormat F = new SimpleDateFormat("dd/MM/yyyy");
		public static final Scanner sc = new Scanner(System.in);
		
		public Project (String projectCod, String nameProject, String startTime, String endTime,  String managerProject, BigDecimal totalCost) throws ParseException {
			this.setProjectCode(projectCod);
			this.setNameProject(nameProject);
			this.startTime = F.parse(startTime);
			this.endTime = F.parse(endTime);
			this.setManagerProject(managerProject);
			this.totalCost = totalCost;
		}
		
		public void inputProject() throws ParseException {
			System.out.println("=====  Input code of project  =====");
			this.setProjectCode(sc.nextLine());
			System.out.println("=====  Input name of project  =====");
			this.setNameProject(sc.nextLine());
			System.out.println("=====  Input start time take place project  =====");
			this.startTime = F.parse(sc.nextLine());
			System.out.println("=====  Input start time take place  project  =====");
			this.endTime = F.parse(sc.nextLine());
			System.out.println("=====  Input manager project  =====");
			this.setManagerProject(sc.nextLine());
			System.out.println("=====  Input total of cost  =====");
			this.totalCost = sc.nextBigDecimal();
		}
		public void displayProject() {
			System.out.printf("======Code of project is: %s======\n======Name of project is: %s======\n======Time start take place project that is: %s======\n======Time end take place project that is: %s======\n======Total cost of project: %.2f======\n======Manager project is: %s======\n\n",
					this.getProjectCode(), this.getNameProject(), F.format(this.startTime), F.format(this.endTime), this.totalCost, this.getManagerProject()
					
					);
		}

		public String getNameProject() {
			return nameProject;
		}

		public void setNameProject(String nameProject) {
			this.nameProject = nameProject;
		}

		public String getManagerProject() {
			return managerProject;
		}

		public void setManagerProject(String managerProject) {
			this.managerProject = managerProject;
		}

		public String getProjectCode() {
			return projectCode;
		}

		public void setProjectCode(String projectCode) {
			this.projectCode = projectCode;
		}
}
