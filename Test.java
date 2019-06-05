package Frame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f1=new JFrame("王者荣耀英雄列表");
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setSize(700,500);
		f1.setLocation(200, 200);
		f1.setVisible(true);
		
		JPanel dibian = new JPanel();
		f1.setContentPane(dibian);
		BorderLayout border = new BorderLayout();
		dibian.setLayout(border);
		
		JPanel zuobian = new JPanel();
		GridLayout gridleft = new GridLayout(5,1,5,5);
		zuobian.setPreferredSize(new Dimension(100, 0));
		zuobian.setLayout(gridleft);
		dibian.add(zuobian, BorderLayout.WEST);
		
		JButton bleft[] = new JButton[5];
		
		for(int i=0; i<bleft.length; i++){
			bleft[i] = new JButton();
			zuobian.add(bleft[i]);
		}
		
		JPanel centre = new JPanel();
		GridLayout grid = new GridLayout(5,5,5,5);
		centre.setLayout(grid);
		
		JButton bi[] = new JButton[25];
		String path = "D:\\java语言程序设计\\photos\\英雄\\";
		ImageIcon image;
		
		for(int i=0; i<bi.length; i++) {
			bi[i] = new JButton();
			image = new ImageIcon(path + (i+1) + ".jpg");
			bi[i].setIcon(image);
			centre.add(bi[i]);
		}
		
		centre.setPreferredSize(new Dimension(500, 0));
		
		dibian.add(centre,BorderLayout.CENTER);
		
		JPanel right = new JPanel();
		GridLayout gridright = new GridLayout(5,1,5,5);
		right.setPreferredSize(new Dimension(100, 0));
		right.setLayout(gridright);
		dibian.add(right, BorderLayout.EAST);
		
		JButton bright[] = new JButton[5];
		for(int i=0; i<bright.length;i++){
			bright[i] = new JButton();
			right.add(bright[i]);
		}
		
		int i;
		for(i = 0;i<bi.length;i++) {
			bi[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JButton button = (JButton)e.getSource();
					bleft[0].setIcon(button.getIcon());
				}
			});
		}
		
		dibian.updateUI();
			
		}
}
