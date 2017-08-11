package hsMain;

public class CardWarrior extends Card {
	public CardWarrior (String n,int m, int a, int l){
		super(n,m,a,l);
		super.faction=Faction.WARRIORS;
	}

}
