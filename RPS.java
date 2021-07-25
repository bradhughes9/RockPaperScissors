import java.util.Random;
public class RPS{
	Random rand = new Random();
	private int cpuChoice;
	
	public RPS(){
		this.random();
	}
	
	public int random(){
		cpuChoice=rand.nextInt(3) + 1;
		return cpuChoice;
	}

	public int get(){
		return cpuChoice;
	}
}