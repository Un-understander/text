package test;
import java.awt.*;
import java.awt.event.*;
public class Bird extends Thread{
	private int xdir=2*(1-2*(int)Math.round(Math.random()));
	private int ydir=2*(1-2*(int)Math.round(Math.random()));
	private boolean running=false;
	private Cage cage=null;
	protected int x,y;
	Image bird =Toolkit.getDefaultToolkit().getImage("brid.jpg");
public Bird(Cage _cage,int _x,int _y){
	cage=_cage;
	x=_x;
	y=_y;
	start();
}
public void start(){
	running=true;
	super.start();
}
public void halt(){
	running=false;
}
public void run(){
	while(running){
		move();
		try{
			sleep(120);
		}catch(InterruptedException ie){
			System.err.println("Thread interrupted");
		}
		cage.repaint();
	}
}
private void move(){
	x+=xdir;
	y+=ydir;
	if(x>cage.getSize().width){
		x=cage.getSize().width;
		xdir*=(-1);
	}
	if(x<0) xdir*=(-1);
	if(y>cage.getSize().height){
		y=cage.getSize().height;
		ydir*=(-1);
	}
	if(y<0) ydir*=(-1);
}
public void draw(Graphics g){
	g.drawImage(bird,x,y,30,40,cage);
}
}