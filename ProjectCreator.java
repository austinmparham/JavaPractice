public class ProjectCreator{
	public String project(){
		return elevatorPitch("Void");
	}

	public String project(String name){
		return elevatorPitch(name);
	}

	public String project(String name,String description){
		if(name.contains("has been created.")){
			String newname = name.substring(0, name.length() - 17);
			return elevatorPitch(newname + ";" + description);
		} else{
			return elevatorPitch(name + ";" + description);
		}
		
	}

	public String elevatorPitch(String project){
		return project + " has been created.";
	}

}