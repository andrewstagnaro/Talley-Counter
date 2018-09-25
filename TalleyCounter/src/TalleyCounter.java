/**
 * 
 * @author andrew stagnaro
 *
 */
public class TalleyCounter 
	{

	private int count;
	
	public TalleyCounter()
	{
		count = 0;
	}
	
	public TalleyCounter(int a)
	{
		count = a;
	}
		
		public void click()
		{
			count ++;
		}
		public int getCount()
		{
			return count;
		}
		public void reset()
		{
			count = 0;
		}
		public void unclick() 
		{
			count--;
		}
	}

