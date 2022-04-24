package multiplayer_game;
import java.util.*;
public class Moderator extends Thread{
 private Generator generate;	
 public Moderator()
 {
	 generate=Generator.getInstance();
 }	
 public void run()
{

	Random r=new Random();
	for(int i=0;i<10;++i)
	{
	int no=r.nextInt(51);
	System.out.println("Moderator Generated:"+no);
	generate.add(no);
    try{
       sleep(1000);
    } catch (InterruptedException e) { }
	}
	
	System.out.println("Nobody won");
}


}
