package pong;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.Timer;

public class Pong implements ActionListener,KeyListener {
	
	public static Pong pong;
	
	public int width = 700,height=700;
	
	public Render renderer;
	
	public Paddle player1;
	
	public Paddle player2;
	
	public Ball ball;
	
	public boolean bot = false,selectDifficulty;
	
	public boolean w,s,up,down;
	
	public int botdifficulty,botMoves,botCooldown = 0;
	
	public Random random;
	
	public int gameStatus = 0,scorelimit=7,playerwon;//0 = Menu 1 = Paused 2 = Play 3 = Over
	
	public Pong() {
		Timer timer = new Timer(20, this);
		JFrame jframe = new JFrame("Pong");
		random = new Random();
		renderer = new Render();
		
		jframe.setSize(width+15, height+35);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.add(renderer);
		jframe.addKeyListener(this);
	
		timer.start();
	}
	public void start() {
		gameStatus = 2;
		player1 = new Paddle(this,1);
		player2 = new Paddle(this,2);
		ball = new Ball(this);
	}
	public static void main(String[] args) {
		pong = new Pong();
	}
	public void update() {
		if(player1.score>= scorelimit) {
			playerwon = 1;
			gameStatus = 3;
		}
		
		if(player2.score>= scorelimit) {
			gameStatus = 3;
			playerwon = 2;
		}
		
		if(w) {
			player1.move(true);
		}
		if(s) {
			player1.move(false);
		}
		
		
		if(!bot) {
			if(up) {
				player2.move(true);
				
			}
			if(down) {
				player2.move(false);
			}
		}
		else 
		{
			if(botCooldown > 0) 
			{
				botCooldown--;
				
				if(botCooldown==0) {
					botMoves  = 0;
				}
			}
			if(botMoves < 10) {
				if(player2.y+player2.height/2 < ball.y) {
					player2.move(false);
					botMoves++;
				}
				if(player2.y+player2.height/2>ball.y) {
					player2.move(true);
					botMoves++;
				}
				
				
				if(botdifficulty == 0) {
					botCooldown = 20;
				}
				if(botdifficulty == 1) {
					botCooldown = 15;
				}
				if(botdifficulty == 2) {
					botCooldown = 10;
				}
				
				
			}
		}
		ball.update(player1, player2);
	}
	public void render(Graphics2D g) {
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, width, height);
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		if(gameStatus==0) {
			g.setColor(Color.WHITE);
			g.setFont(new Font("Arial",1,50));
			g.drawString("PONG",width/2 - 75, 50);
			
			if(!selectDifficulty) {
				g.setFont(new Font("Arial",1,30));
				
				g.drawString("Press Space to Play",width/2 - 150, height/2-25);
				g.drawString("Press Shift to Play with Bot",width/2 - 200, height/2+25);
				g.drawString("<<Score Limit:"+scorelimit+">>",width/2 - 150, height/2+65);
			}
		}
		if (selectDifficulty) {
			
			String string = botdifficulty == 0 ? "Easy": (botdifficulty == 1 ?"Medium":"Hard");
			
			g.setFont(new Font("Arial",1,30));
			
			g.drawString("Bot Difficulty:"+string,width/2 - 150, height/2-25);
			g.drawString("Press Space to Play",width/2 - 150, height/2+50);
		}
		if(gameStatus==1) {
			g.setColor(Color.WHITE);
			g.setFont(new Font("Arial",1,50));
			g.drawString("PAUSED",width/2 - 103, height/2 - 25);
		}
		if(gameStatus==1||gameStatus==2) {
			g.setColor(Color.WHITE);
			
			g.setStroke(new BasicStroke(5f));
			
			g.drawLine(width/2,0, width/2, height);
			
			g.setStroke(new BasicStroke(2f));
			
			g.drawOval(width/2 -150, height/2-150, 300, 300);
			
			g.setFont(new Font("Arial",1,50));
			
			g.drawString(String.valueOf(player1.score),width/2 - 90, 50);
			
			g.drawString(String.valueOf(player2.score),width/2 + 65, 50);
			
			player1.render(g);
			player2.render(g);
			ball.render(g);
		}
		if(gameStatus==3) {
			g.setColor(Color.WHITE);
			
			g.setFont(new Font("Arial",1,50));
			
			g.drawString("PONG",width/2 - 75, 50);
			
			if(bot && playerwon == 2) {
				g.drawString("The Bot Wins!", width / 2 - 170, 200);
			}else {
				g.drawString("Player " + playerwon + " Wins!", width / 2 - 165, 200);
			}
			
			g.setFont(new Font("Arial",1,30));
			
			g.drawString("Press Space to Play Agian",width/2 - 170, height/2-25);
			g.drawString("<<Press ESC for Menu>>",width/2 - 150, height/2+65);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(gameStatus==2) {
			update();
		}
	
		
		renderer.repaint();
	}
	@Override
	public void keyPressed(KeyEvent e) {
		int id = e.getKeyCode();

		if (id == KeyEvent.VK_W)
		{
			w = true;
		}
		else if (id == KeyEvent.VK_S)
		{
			s = true;
		}
		else if (id == KeyEvent.VK_UP)
		{
			up = true;
		}
		else if (id == KeyEvent.VK_DOWN)
		{
			down = true;
		}
		else if (id == KeyEvent.VK_RIGHT)
		{
			if (selectDifficulty)
			{
				if (botdifficulty < 2)
				{
					botdifficulty++;
				}
				else
				{
					botdifficulty = 0;
				}
			}
			else if (gameStatus == 0)
			{
				scorelimit++;
			}
		}
		else if (id == KeyEvent.VK_LEFT)
		{
			if (selectDifficulty)
			{
				if (botdifficulty > 0)
				{
					botdifficulty--;
				}
				else
				{
					botdifficulty = 2;
				}
			}
			else if (gameStatus == 0 && scorelimit > 1)
			{
				scorelimit--;
			}
		}
		else if (id == KeyEvent.VK_ESCAPE && (gameStatus == 2 || gameStatus == 3))
		{
			gameStatus = 0;
		}
		else if (id == KeyEvent.VK_SHIFT && gameStatus == 0)
		{
			bot = true;
			selectDifficulty = true;
		}
		else if (id == KeyEvent.VK_SPACE)
		{
			if (gameStatus == 0 || gameStatus == 3)
			{
				if (!selectDifficulty)
				{
					bot = false;
				}
				else
				{
					selectDifficulty = false;
				}

				start();
			}
			else if (gameStatus == 1)
			{
				gameStatus = 2;
			}
			else if (gameStatus == 2)
			{
				gameStatus = 1;
			}
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		int id = e.getKeyCode();
		if(id==KeyEvent.VK_W) {
			w = false;
		}
		else if(id==KeyEvent.VK_S) {
			s = false;
		}
		else if(id==KeyEvent.VK_UP) {
			up = false;
		}
		else if(id==KeyEvent.VK_DOWN) {
			down = false;
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
