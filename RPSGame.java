public class RPSGame{
	int outcome;
	RPS cpu = new RPS();
	
	
	public int play(int userChoice)
	{
		int user = userChoice + 1;
		int cpuChoice = cpu.random();
		
		//0 = loss, 1 = win, 2 = draw.
		//Rock=1, Paper=2, Scissors=3
		
		//if user selects rock
		if(user==1)
		{
			if(cpuChoice==1)
			{
				outcome = 2;
			}
			else if(cpuChoice==2)
			{
				outcome = 0;
			}
			else
			{
				outcome = 1;
			}
		}
		
		//if user selects paper
		if(user==2)
		{
			if(cpuChoice==1)
			{
				outcome = 1;
			}
			else if(cpuChoice==2)
			{
				outcome = 2;
			}
			else
			{
				outcome = 0;
			}
		}
		
		//if user selects sicssors
		if(user==3)
		{
			if(cpuChoice==1)
			{
				outcome = 0;
			}
			else if(cpuChoice==2)
			{
				outcome = 1;
			}
			else
			{
				outcome = 2;
			}
		}
		return outcome;
		
	}
	public int getCpuValue()
	{
		return cpu.get();
	}
	
	
}