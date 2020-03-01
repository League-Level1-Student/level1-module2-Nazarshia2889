package _02_sea_creature;

public class seaRunner {
	public static void main(String[] args) {
		SeaCreature s = new SeaCreature("Spongebob");
		s.getName();
		s.eat();
		s.laugh();
		SeaCreature p = new SeaCreature("Patrick");
		p.getName();
		p.eat();
		p.laugh();
		SeaCreature sq = new SeaCreature("Squidward");
		sq.getName();
		sq.eat();
		sq.laugh();
	}

}
