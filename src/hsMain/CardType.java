package hsMain;

public enum CardType {
	MAGE("Mage"),
	CLOSE("Close"),
	RANGE("Range"),
	MACHINE ("Machine"),
	BIG ("Big"),
	SWARM ("Swarm");
	
	
	private String typeName;
	
	private CardType(String name){
		this.typeName=name;
	}
	public String toString(){
		return typeName;
	}
	
	public String getTypeName(){
		return toString();
	}
}
