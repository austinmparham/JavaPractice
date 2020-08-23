public class ProjectCreatorTest {
	public static void main(String[] args){
		ProjectCreator p = new ProjectCreator();

		String project1 = p.project();
		System.out.println(project1);

		String project2 = p.project("Turf War");
		System.out.println(project2);

		String project3 = p.project("CopQA","A crowd sourced database of cop interactions from a citizen perspective.");
		System.out.println(project3);

		String project4 = p.project(project2,"A boardgame of fleeting alligiance.");
		System.out.println(project4);

	}
}