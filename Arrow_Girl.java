import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.font.*;
import javax.swing.border.*;
import java.awt.Dimension;

public class Arrow_Girl extends JFrame implements ActionListener,MouseListener, MouseMotionListener
{
	JPanel p, p1, p2;
	JButton bQuit, bBack, bPlay, bHit;
	CardLayout c1;
	JLabel lFrontImg, lTitle, lGirl, lArrow, lBall1, lBallB1, lBall2, lBallB2, lBall3, lBallB3, lBall4, lBallB4, lBall5, lBallB5, lBall6, lBallB6, lBall7, lBallB7, lBall8, lBallB8, lBall9, lBallB9, lBall10, lBallB10;
	ImageIcon frontImg, titleImg, girl, ball, arrow, ballB;
	Timer tA, tB1, tBb1, tB2, tBb2, tB3, tBb3, tB4, tBb4, tB5, tBb5, tB6, tBb6, tB7, tBb7, tB8, tBb8, tB9, tBb9, tB10, tBb10;
	boolean flag = true;

	int Y=10; //Deviation 
	int ax, ay, ax1=165, ay1=20, aX=10; //Arrow
	int bx=1300, by=700, bx1=44, by1=44; //Ball1
	int cx=1200, cy=700, cx1=44, cy1=44; //Ball2
	int dx=1100, dy=700, dx1=44, dy1=44; //Ball3
	int ex=1000, ey=700, ex1=44, ey1=44; //Ball4
	int fx=900, fy=700, fx1=44, fy1=44; //Ball5
	int gx=800, gy=700, gx1=44, gy1=44; //Ball6
	int hx=700, hy=700, hx1=44, hy1=44; //Ball7
	int ix=600, iy=700, ix1=44, iy1=44; //Ball8 
	int jx=500, jy=700, jx1=44, jy1=44; //Ball9
	int kx=400, ky=700, kx1=44, ky1=44; //Ball10

	public Arrow_Girl()
	{
		c1 = new CardLayout();
		p = new JPanel();
		p1 = new JPanel();
		p2 = new JPanel();

		frontImg = new ImageIcon("Front.gif");
		titleImg = new ImageIcon("title2.png");
		girl = new ImageIcon("awm.png");
		arrow = new ImageIcon("arrow.png");
		ball = new ImageIcon("ball.gif");
		ballB = new ImageIcon("ballB.gif");
		lFrontImg = new JLabel(frontImg);		
		lTitle = new JLabel(titleImg);
		lGirl = new JLabel(girl);
		lArrow = new JLabel(arrow);
		lBall1 = new JLabel(ball);
		lBallB1 = new JLabel(ballB);
		lBall2 = new JLabel(ball);
		lBallB2 = new JLabel(ballB);
		lBall3 = new JLabel(ball);
		lBallB3 = new JLabel(ballB);
		lBall4 = new JLabel(ball);
		lBallB4 = new JLabel(ballB);
		lBall5 = new JLabel(ball);
		lBallB5 = new JLabel(ballB);
		lBall6 = new JLabel(ball);
		lBallB6 = new JLabel(ballB);
		lBall7 = new JLabel(ball);
		lBallB7 = new JLabel(ballB);
		lBall8 = new JLabel(ball);
		lBallB8 = new JLabel(ballB);				
		lBall9 = new JLabel(ball);
		lBallB9 = new JLabel(ballB);
		lBall10 = new JLabel(ball);
		lBallB10 = new JLabel(ballB);
		bPlay = new JButton("PLAY");
		bBack = new JButton("BACK");
		bHit = new JButton("HIT");
		bQuit = new JButton("QUIT");

		lTitle.setBounds(200,50,939,140);
		lFrontImg.setBounds(600,200,172,393);
		lGirl.setBounds(10,100,172,393);
		lArrow.setBounds(170,300,165,20);
		
		bPlay.setBounds(500,600,80,40);
		bQuit.setBounds(800,600,80,40);
		bHit.setBounds(100,10,80,35);
		bBack.setBounds(10,10,75,35);

		p1.setLayout(null);
		p1.setBackground(Color.BLACK);
		p1.add(lTitle);
		p1.add(lFrontImg);
		p1.add(bPlay);
		p1.add(bQuit);

		p2.setLayout(null);
		p2.add(lArrow);
		p2.add(lGirl);
		p2.add(lBall1);
		p2.add(lBallB1);
		p2.add(lBall2);
		p2.add(lBallB2);
		p2.add(lBall3);
		p2.add(lBallB3);
		p2.add(lBall4);
		p2.add(lBallB4);
		p2.add(lBall5);
		p2.add(lBallB5);
		p2.add(lBall6);
		p2.add(lBallB6);
		p2.add(lBall7);
		p2.add(lBallB7);
		p2.add(lBall8);
		p2.add(lBallB8);
		p2.add(lBall9);
		p2.add(lBallB9);
		p2.add(lBall10);
		p2.add(lBallB10);		
		p2.add(bHit);
		p2.add(bBack);

		p.setLayout(c1);
		p.add(p1,"1");
		p.add(p2,"2");
		c1.show(p,"1");

		Font ft = new Font("SansSerif", Font.BOLD, 14);
		bPlay.setFont(ft);
		bPlay.setBorderPainted(false);
		bPlay.setFocusPainted(false);
		bPlay.setBackground(new Color(93,93,93));
		bPlay.setForeground(Color.WHITE);
		
		bQuit.setFont(ft);
		bQuit.setBorderPainted(false);
		bQuit.setFocusPainted(false);
		bQuit.setBackground(new Color(93,93,93));
		bQuit.setForeground(Color.WHITE);
		

		bHit.setFont(ft);
		bHit.setBorderPainted(false);
		bHit.setFocusPainted(false);
		bHit.setBackground(Color.BLACK);
		bHit.setForeground(Color.WHITE);

		bBack.setFont(ft);
		bBack.setBorderPainted(false);
		bBack.setFocusPainted(false);
		bBack.setBackground(Color.BLACK);
		bBack.setForeground(Color.WHITE);

		add(p);
		setSize(1380,800);
		setVisible(true);

		bQuit.addActionListener(this);
		bPlay.addActionListener(this);
		bHit.addActionListener(this);
		bBack.addActionListener(this);

		addMouseListener(this);
		addMouseMotionListener(this);

		// BALL 1 MOVEMENT
		lBall1.setBounds(1300,700,44,44);
		ActionListener lb = new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{	
				by-=Y;
				
				lBall1.setBounds(bx,by,bx1,by1);
				
				if(by == 0)
				{
					bx=1300; by=700;
				}
			}		
		};
		tB1 = new Timer(30,lb);
		tB1.start();
		
		// BALL 2 MOVEMENT
		lBall2.setBounds(1200,700,44,44);
		ActionListener lc = new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{	
				cy-=Y;
				
				lBall2.setBounds(cx,cy,cx1,cy1);
				
				if(cy == 0)
				{
					cx=1200; cy=700;
				}
			}		
		};
		tB2 = new Timer(50,lc);
		tB2.start();

		// BALL 3 MOVEMENT
		lBall3.setBounds(1100,700,44,44);
		ActionListener ld = new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{	
				dy-=Y;
				
				lBall3.setBounds(dx,dy,dx1,dy1);
				
				if(dy == 0)
				{
					dx=1100; dy=700;
				}
			}		
		};
		tB3 = new Timer(40,ld);
		tB3.start();

		// BALL 4 MOVEMENT
		lBall4.setBounds(1000,700,44,44);
		ActionListener le = new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{	
				ey-=Y;
				
				lBall4.setBounds(ex,ey,ex1,ey1);
				
				if(ey == 0)
				{
					ex=1000; ey=700;
				}
			}		
		};
		tB4 = new Timer(35,le);
		tB4.start();

		// BALL 5 MOVEMENT
		lBall5.setBounds(900,700,44,44);
		ActionListener lf = new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{	
				fy-=Y;
				
				lBall5.setBounds(fx,fy,fx1,fy1);
				
				if(fy == 0)
				{
					fx=900; fy=700;
				}
			}		
		};
		tB5 = new Timer(20,lf);
		tB5.start();

		// BALL 6 MOVEMENT
		lBall6.setBounds(800,700,44,44);
		ActionListener lg = new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{	
				gy-=Y;
				
				lBall6.setBounds(gx,gy,gx1,gy1);
				
				if(gy == 0)
				{
					gx=800; gy=700;
				}
			}		
		};
		tB6 = new Timer(40,lg);
		tB6.start();

		// BALL 7 MOVEMENT
		lBall7.setBounds(700,700,44,44);
		ActionListener lh = new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{	
				hy-=Y;
				
				lBall7.setBounds(hx,hy,hx1,hy1);
				
				if(hy == 0)
				{
					hx=700; hy=700;
				}
			}		
		};
		tB7 = new Timer(15,lh);
		tB7.start();

		// BALL 8 MOVEMENT
		lBall8.setBounds(600,700,44,44);
		ActionListener li = new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{	
				iy-=Y;
				
				lBall8.setBounds(ix,iy,ix1,iy1);
				
				if(iy == 0)
				{
					ix=600; iy=700;
				}
			}		
		};
		tB8 = new Timer(32,li);
		tB8.start();

		// BALL 9 MOVEMENT
		lBall9.setBounds(500,700,44,44);
		ActionListener lj = new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{	
				jy-=Y;
				
				lBall9.setBounds(jx,jy,jx1,jy1);
				
				if(jy == 0)
				{
					jx=500; jy=700;
				}
			}		
		};
		tB9 = new Timer(42,lj);
		tB9.start();

		// BALL 10 MOVEMENT
		lBall10.setBounds(400,700,44,44);
		ActionListener lk = new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{	
				ky-=Y;
				
				lBall10.setBounds(kx,ky,kx1,ky1);
				
				if(ky == 0)
				{
					kx=400; ky=700;
				}
			}		
		};
		tB10 = new Timer(20,lk);
		tB10.start();

/*        addKeyListener(new KeyListener()
        {
            @Override
            public void keyPressed(KeyEvent e)
            {
                int keyCode = e.getKeyCode();
                int y = 0;

                switch( keyCode )
                { 
                    case KeyEvent.VK_UP:    y = lGirl.getY();
                                            lGirl.setBounds(10,y-10,172,393);
                                            break;

                    case KeyEvent.VK_DOWN:  y = lGirl.getY();
                                            lGirl.setBounds(10,y+10,172,393);
                                            break;
                }

            }
            
            @Override
            public void keyReleased(KeyEvent e) {}
            
            @Override
            public void keyTyped(KeyEvent e) {}     
        });
      add(lGirl); */
    
    ax= lGirl.getX()+51; ay= lGirl.getY()+90;
	}  //CLASS CONSTRUCTOR ENDS

	
//	@Override   GIRL MOVEMENT ALONG WITH MOUSE
	public void mouseMoved(MouseEvent m)
	{
		int y, ax= lGirl.getX()+51, ay= lGirl.getY()+90;
		y = m.getY();
		lGirl.setBounds(10,y,172,393);
		lArrow.setBounds(ax,ay,165,20);
	}
	@Override public void mouseClicked(MouseEvent m){}
	@Override public void mouseEntered(MouseEvent m){}
	@Override public void mousePressed(MouseEvent m){}
	@Override public void mouseReleased(MouseEvent m){}
	@Override public void mouseExited(MouseEvent m){}
	@Override public void mouseDragged(MouseEvent m){}


	// EVENTS ON BUTTON PRESS	
	//@OverRide
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == bQuit)
		{
			System.exit(0);
		}

		if(e.getSource() == bPlay)
		{
			c1.show(p,"2");
		}

		if(e.getSource() == bHit && flag)
		{
			ax= lGirl.getX()+51; ay= lGirl.getY()+90;
			flag=false;
		
			ActionListener la1 = new ActionListener(){
			
				public void actionPerformed(ActionEvent e)
				{	
					ax+=aX;
					lArrow.setBounds(ax,ay,ax1,ay1);
				
					// ARROW HITS & GOES OUT OF SCREEN
					if(ax >= 1370)
					{
						ax=lGirl.getX()+51; ay=lGirl.getY()+90;
						tA.stop();
						flag = true;
					}
		
					// BALLOON.1 BURST CODE 
					if((lArrow.getX()+165 >= lBall1.getX() && lArrow.getX() <= lBall1.getX()+44) && ((lArrow.getY()+20 <= lBall1.getY()+44) && (lArrow.getY()+20 >= lBall1.getY())))
					{
						tB1.stop();
						ActionListener lb1 = new ActionListener(){
							public void actionPerformed(ActionEvent e)
							{	
								lBall1.setIcon(ballB);
								lBall1.setBounds(1300,by,44,44);
								by+=Y;
							}
						};	
						tBb1 = new Timer(20,lb1);
						tBb1.start();

						if(by > 780)
							tBb1.stop();
					}

					// BALLOON.2 BURST CODE
					if((lArrow.getX()+165 >= lBall2.getX() && lArrow.getX() <= lBall2.getX()+44) && ((lArrow.getY()+20 <= lBall2.getY()+44) && (lArrow.getY()+20 >= lBall2.getY())))
					{
						tB2.stop();
						ActionListener lb2 = new ActionListener(){
							public void actionPerformed(ActionEvent e)
							{
								lBall2.setIcon(ballB);
								lBall2.setBounds(1200,cy,44,44);
								cy+=Y;
							}
						};
						tBb2 = new Timer(20,lb2);
						tBb2.start();

						if(cy>780)
							tBb2.stop();
					}

					// BALLOON.3 BURST CODE
					if((lArrow.getX()+165 >= lBall3.getX() && lArrow.getX() <= lBall3.getX()+44) && ((lArrow.getY()+20 <= lBall3.getY()+44) && (lArrow.getY()+20 >= lBall3.getY())))
					{
						tB3.stop();
						ActionListener lb3 = new ActionListener(){
							public void actionPerformed(ActionEvent e)
							{
								lBall3.setIcon(ballB);
								lBall3.setBounds(1100,dy,44,44);
								dy+=Y;
							}
						};
						tBb3 = new Timer(20,lb3);
						tBb3.start();

						if(dy>780)
							tBb3.stop();
					}

					// BALLOON.4 BURST CODE
					if((lArrow.getX()+165 >= lBall4.getX() && lArrow.getX() <= lBall4.getX()+44) && ((lArrow.getY()+20 <= lBall4.getY()+44) && (lArrow.getY()+20 >= lBall4.getY())))
					{
						tB4.stop();
						ActionListener lb4 = new ActionListener(){
							public void actionPerformed(ActionEvent e)
							{
								lBall4.setIcon(ballB);
								lBall4.setBounds(1000,ey,44,44);
								ey+=Y;
							}
						};
						tBb4 = new Timer(20,lb4);
						tBb4.start();

						if(ey>780)
							tBb4.stop();
					}


					// BALLOON.5 BURST CODE
					if((lArrow.getX()+165 >= lBall5.getX() && lArrow.getX() <= lBall5.getX()+44) && ((lArrow.getY()+20 <= lBall5.getY()+44) && (lArrow.getY()+20 >= lBall5.getY())))
					{
						tB5.stop();
						ActionListener lb5 = new ActionListener(){
							public void actionPerformed(ActionEvent e)
							{
								lBall5.setIcon(ballB);
								lBall5.setBounds(900,fy,44,44);
								fy+=Y;
							}
						};
						tBb5 = new Timer(20,lb5);
						tBb5.start();

						if(fy>780)
							tBb5.stop();
					}

					// BALLOON.6 BURST CODE
					if((lArrow.getX()+165 >= lBall6.getX() && lArrow.getX() <= lBall6.getX()+44) && ((lArrow.getY()+20 <= lBall6.getY()+44) && (lArrow.getY()+20 >= lBall6.getY())))
					{
						tB6.stop();
						ActionListener lb6 = new ActionListener(){
							public void actionPerformed(ActionEvent e)
							{
								lBall6.setIcon(ballB);
								lBall6.setBounds(800,gy,44,44);
								gy+=Y;
							}
						};
						tBb6 = new Timer(20,lb6);
						tBb6.start();

						if(gy>780)
							tBb6.stop();
					}

					// BALLOON.7 BURST CODE
					if((lArrow.getX()+165 >= lBall7.getX() && lArrow.getX() <= lBall7.getX()+44) && ((lArrow.getY()+20 <= lBall7.getY()+44) && (lArrow.getY()+20 >= lBall7.getY())))
					{
						tB7.stop();
						ActionListener lb7 = new ActionListener(){
							public void actionPerformed(ActionEvent e)
							{
								lBall7.setIcon(ballB);
								lBall7.setBounds(700,hy,44,44);
								hy+=Y;
							}
						};
						tBb7 = new Timer(20,lb7);
						tBb7.start();

						if(hy>780)
							tBb7.stop();
					}

					// BALLOON.8 BURST CODE
					if((lArrow.getX()+165 >= lBall8.getX() && lArrow.getX() <= lBall8.getX()+44) && ((lArrow.getY()+20 <= lBall8.getY()+44) && (lArrow.getY()+20 >= lBall8.getY())))
					{
						tB8.stop();
						ActionListener lb8 = new ActionListener(){
							public void actionPerformed(ActionEvent e)
							{
								lBall8.setIcon(ballB);
								lBall8.setBounds(600,iy,44,44);
								iy+=Y;
							}
						};
						tBb8 = new Timer(20,lb8);
						tBb8.start();

						if(iy>780)
							tBb8.stop();
					}

					// BALLOON.9 BURST CODE
					if((lArrow.getX()+165 >= lBall9.getX() && lArrow.getX() <= lBall9.getX()+44) && ((lArrow.getY()+20 <= lBall9.getY()+44) && (lArrow.getY()+20 >= lBall9.getY())))
					{
						tB9.stop();
						ActionListener lb9 = new ActionListener(){
							public void actionPerformed(ActionEvent e)
							{
								lBall9.setIcon(ballB);
								lBall9.setBounds(500,jy,44,44);
								jy+=Y;
							}
						};
						tBb9 = new Timer(20,lb9);
						tBb9.start();

						if(jy>780)
							tBb9.stop();
					}

					// BALLOON.10 BURST CODE
					if((lArrow.getX()+165 >= lBall10.getX() && lArrow.getX() <= lBall10.getX()+44) && ((lArrow.getY()+20 <= lBall10.getY()+44) && (lArrow.getY()+20 >= lBall10.getY())))
					{
						tB10.stop();
						ActionListener lb10 = new ActionListener(){
							public void actionPerformed(ActionEvent e)
							{
								lBall10.setIcon(ballB);
								lBall10.setBounds(400,ky,44,44);
								ky+=Y;
							}
						};
						tBb10 = new Timer(20,lb10);
						tBb10.start();

						if(ky>780)
							tBb10.stop();
					}

				} // ARROW ACTION PERFORMED ENDS 	
			};
			tA = new Timer(10,la1);
			tA.start();	
		}		

		if(e.getSource() == bBack)
		{
			c1.show(p,"1");
		}
	}

	public static void main(String[]args)
	{
		Arrow_Girl m = new Arrow_Girl();
	}
}