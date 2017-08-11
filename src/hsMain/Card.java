package hsMain;



public abstract class Card {

	private int manaPts;
	private int attackPts;
	private int lifePts;
	private int curHPts;
	private String name;
	protected Faction faction;
	protected CardType type;
	
	
	public Card(String n,int m, int a, int l){
		this.name=n;
		this.manaPts=m;
		this.attackPts=a;
		this.lifePts=l;
		this.curHPts=l;
	}
	
	
	public String attack1(Card target){
		System.out.println("Attack is used on"+target.getName());
		return "Attack is used on"+target.getName();
		
	}
	
	public String getAttacked(int dmg){
		if(curHPts>dmg){
			curHPts-=dmg;
		}
		else{
			curHPts=0;
			return attackInfo(dmg)+"/n"+deadInfo();
		}
		return attackInfo(dmg);
	}

	private String attackInfo(int dmg){
		if(dmg>0){
		return "Dealt "+dmg+" to "+getName();
		}else{
			return "";
		}
	}
	
	private final String deadInfo(){
		return getName()+" is dead.";
	}

	public int getManaPts() {
		return manaPts;
	}


	public void setManaPts(int manaPts) {
		this.manaPts = manaPts;
	}


	public int getAttackPts() {
		return attackPts;
	}


	public void setAttackPts(int attackPts) {
		this.attackPts = attackPts;
	}


	public int getLifePts() {
		return lifePts;
	}


	public void setLifePts(int lifePts) {
		this.lifePts = lifePts;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
