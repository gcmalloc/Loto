import java.util.HashSet;


public class Jeu {
	private HashSet<Integer> joue;
	
	public Jeu() {
		this.joue = new HashSet<Integer>();
	}
	
	public void tire() {
		Integer tire = rand();
		while (this.dejaJoue(tire.intValue())) {
			tire = rand();
		}
		joue.add(tire);
		System.out.println(tire);
	}
	
	public boolean dejaJoue(int c) {
	Integer cCompl = new Integer(c);
	return joue.contains(cCompl);
	}
	
	private static Integer rand() {
		int randomNumber = (int)(Math.random() * 90);
		randomNumber++;
		Integer retur = new Integer(randomNumber);
		return retur;
	}
	
	public boolean isFull(){
		if (this.joue.size() == 89)
			return true;
		else
			return false;
	}
	
	@Override
	public String toString() {
		return this.joue.toString();
	}
}
