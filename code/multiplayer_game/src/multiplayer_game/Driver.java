package multiplayer_game;
import java.io.*;

public class Driver {
public static void main(String args[])
{  
	InputStreamReader isr =new InputStreamReader(System.in);
	BufferedReader br= new BufferedReader(isr) ;
	String str[]=new String[5];
	try {
      for(int i=0;i<5;++i)
		{System.out.println("Input the name of player"+(i+1)+" ");
    	  str[i] = br.readLine();
		
		}
		}
	catch(Exception e) {}
	Moderator m=new Moderator();
	Players p1=new Players(1,str[0]);
	Players p2=new Players(2,str[1]);
	Players p3=new Players(3,str[2]);
	Players p4=new Players(4,str[3]);
	Players p5=new Players(5,str[4]);
	System.out.println(p1.tokens);
	System.out.println(p2.tokens);
	System.out.println(p3.tokens);
	System.out.println(p4.tokens);
	System.out.println(p5.tokens);
	

		
		m.start();
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();


}
}
