package multiplayer_game;
import java.util.*;
public class Generator{
	
	private volatile static  Generator g;
	
	ArrayList<Integer> generated_numbers;
	int count=0;
	int arr[]=new int[5];
	int n;    
	private Generator()
	{   
		
	   for(int i=0;i<5;++i)
		   arr[i]=0;
		
	   generated_numbers=new ArrayList<Integer>();
		
	}
	
	public static Generator getInstance()
	{
		if(g==null)
		{
			synchronized (Generator.class)
			{
				if(g==null)
					g=new Generator();
			}
		}
		return g;	
	}
	
	
	
	public synchronized void add(int number) 
	{
		
		while (count==5) 
		{
	         try {
	            wait();
	         } catch (InterruptedException e) { } 
	    }
	      generated_numbers.add(number);
	      for(int i=0;i<5;++i)
			   arr[i]=0;
	      count = 5;
	      notifyAll();
	}
	
	public synchronized int read() 
	{
	
	
		while(count==0) {
	         try {
	            wait();
	         } catch (InterruptedException e) {}
	      }
		
	      count=count-1;
	      notifyAll();
	      return generated_numbers.get(generated_numbers.size()-1);
    }

}
