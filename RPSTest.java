public class RPSTest{
	
public static void main(String[] arg)
	{
		int counter = 0;
		int rockCounter = 0;
		int paperCounter = 0;
		int scissorsCounter = 0;
		int count4 = 0;
		int randomChoice;
		
		RPS test = new RPS();
		for(int i=0; i < 100; i++)
			{
				//getting the CPU random roll for their choice
				randomChoice=test.random();
				
				switch(randomChoice)
				{
					//rock coounter
					case 1 :
						rockCounter=rockCounter+1;
						break;
						
					//paper counter
					case 2 :
						paperCounter=paperCounter+1;
						break;
					
					//scissors counter
					case 3 :
						scissorsCounter=scissorsCounter+1;
						break;
						
					//if this recieves a value then we know that something is wrong
					case 4 :
						scissorsCounter=count4+1;
						break;
					case 0 :
						counter =counter+1;
						break;
						
				}
				
			}
			
		System.out.println("Counters");
		System.out.println(rockCounter);
		System.out.println(paperCounter);
		System.out.println(scissorsCounter);
		System.out.println(counter);
		System.out.println(count4);
	
	}
}