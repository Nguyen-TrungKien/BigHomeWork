package btl.com;

import java.text.ParseException;
import java.util.ArrayList;

public class manageProject {
	private ArrayList<Project> listProject = new ArrayList<Project>();
	
	public void addProject(Project p ) {
		getListProject().add(p);
	}
	
	public void deleteProject (Project p ) {
		getListProject().remove(p);
	}
	
	public void deleteProject (String informProject) {
//		manageProject m = new manageProject();
//		this.listProject.stream().filter(name->name.getNameProject().contains(informProject)==true).forEach(name->
//			m.deleteProject(name)
//		);
//		return m;
		for (Project pro: this.listProject) {
			if (pro.getNameProject().contains(informProject) || pro.getManagerProject().equalsIgnoreCase(informProject) || pro.getProjectCode().equalsIgnoreCase(informProject)) {
				this.deleteProject(pro);
			}
		}
	}
	public void fixProject (String informProject) throws ParseException {

		System.out.println(" fix of project according name project");
		this.listProject.stream().filter(name->name.getNameProject().equalsIgnoreCase(informProject)==true || 
				name.getManagerProject().contains(informProject) || name.getProjectCode().equalsIgnoreCase(informProject)).forEach(name->{
			try {
				name.inputProject();
			} catch (ParseException e) {
				
				e.printStackTrace();
			}
		});
//		for (Project p:this.listProject) {
//			if(p.getNameProject().equals(nameProject)) {
//				p.inputProject();
//			}
//		}
	}
	
	public void displayListProject() {
		this.listProject.forEach(ds->ds.displayProject());
	}

	public ArrayList<Project> getListProject() {
		return listProject;
	}

	public void setListProject(ArrayList<Project> listProject) {
		this.listProject = listProject;
	}
}
