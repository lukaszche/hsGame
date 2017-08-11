package hsMain;

public enum Faction {
	MAGES("Mages"),
	WARRIORS("Warriors"),
	ELVES("Elves");
	
	
	private String factionName;
	
	private Faction(String name){
		this.factionName=name;
	}
	public String toString(){
		return factionName;
	}
	
	public String getFactionName(){
		return toString();
	}
}
