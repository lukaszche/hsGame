package hsMain;

public class CardMage extends Card{
	public CardMage (String n,int m, int a, int l){
		super(n,m,a,l);
		super.faction=Faction.MAGES;	
	}
}
