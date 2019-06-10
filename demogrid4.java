package Frame;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;

public class demogrid4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame("计算器");
		jf.setSize(300,500);
		jf.setLocation(200, 200);
		jf.setVisible(true);
		
		JMenuBar bar = new JMenuBar();
		jf.setJMenuBar(bar);
		
		JMenu chakan = new JMenu("查看");
		JMenuItem biaozhun = new JMenuItem("标准型");
		JMenuItem kexue = new JMenuItem("科学型");
		JMenuItem chengxu = new JMenuItem("程序型");
		chakan.add(biaozhun);
		chakan.add(kexue);
		chakan.add(chengxu);
		bar.add(chakan);
		
		JMenu bianji = new JMenu("编辑");
		JMenuItem fuzhi = new JMenuItem("复制");
		JMenuItem zhantie = new JMenuItem("粘贴");
		bar.add(bianji);
		
		JMenu bangzhu = new JMenu("帮助");
		JMenuItem guanyu = new JMenuItem("关于计算机");	
		bangzhu.add(guanyu);
		bar.add(bangzhu);
		Border border = BorderFactory.createLineBorder(Color.RED);
		JPanel jp = new JPanel();
		jf.setContentPane(jp);
		jp.setLayout(new BorderLayout());
		
		
		JPanel xianshi = new JPanel();
		JPanel anjian = new JPanel();
		JPanel anjian_1 = new JPanel();
		

		
		JTextField jieguo = new JTextField(25);
		xianshi.add(jieguo);
		xianshi.setBorder(BorderFactory.createLoweredBevelBorder());
		jieguo.setPreferredSize(new Dimension(0, 80));
		
		jp.add(xianshi,BorderLayout.NORTH);
		
		anjian.setPreferredSize(new Dimension(0, 240));
		GridLayout layout = new GridLayout(4, 5, 5, 5);
		anjian.setLayout(layout);
		
		String[] str = {
				"MC","MR","MS","M+","M-",
				"←","CE","C","±","√",
				"7","8","9","/","%",
				"4","5","6","*","1/x",
		};
		
		JButton bt[] = new JButton[20];
		for (int i=0; i<bt.length; i++){
			bt[i] = new JButton(str[i]);
			anjian.add(bt[i]);
		}
		
		jp.add(anjian,BorderLayout.CENTER);
		
		anjian_1.setPreferredSize(new Dimension(0, 120));
		GridBagLayout gblayout = new GridBagLayout();
		
		jp.add(anjian_1,BorderLayout.SOUTH);
		
		anjian_1.setLayout(gblayout);
		String[] str1= {"1", "2", "3", "-", "=", "0", ".", "+"};
		
		JButton bt1[] = new JButton[str1.length];
		
		for(int i=0; i<bt1.length; i++){
			bt1[i] = new JButton(str1[i]);
			if(i==0){
				GridBagConstraints gbc = new GridBagConstraints();
				gbc.gridx = i;
				gbc.gridy = 0;
				gbc.insets = new Insets(5, 0, 0, 0);
				gbc.weightx = 20;
				gbc.weighty = 50;
				gbc.fill = GridBagConstraints.BOTH;
				anjian_1.add(bt1[i],gbc);
			}
			
			if(i<4 && i>0){
				GridBagConstraints gbc = new GridBagConstraints();
				gbc.gridx = i;
				gbc.gridy = 0;
				gbc.insets = new Insets(5, 5, 0, 0);
				gbc.weightx = 20;
				gbc.weighty = 50;
				gbc.fill = GridBagConstraints.BOTH;
				anjian_1.add(bt1[i],gbc);
			}
			
			if(i==4){
				GridBagConstraints gbc = new GridBagConstraints();
				gbc.gridx = i;
				gbc.gridy = 0;
				gbc.gridheight = 2;
				gbc.weightx = 20;
				gbc.weighty = 50;
				gbc.insets = new Insets(5, 5, 0, 0);
				gbc.fill = GridBagConstraints.BOTH;
				anjian_1.add(bt1[i],gbc);
			}
		
			if(i==5){
			GridBagConstraints gbc = new GridBagConstraints();
			gbc.gridx = 0;
			gbc.gridy = 1;
			gbc.gridwidth = 2;
			gbc.weightx = 20;
			gbc.weighty = 50;
			gbc.insets = new Insets(5, 0, 0, 0);
			gbc.fill = GridBagConstraints.BOTH;
			anjian_1.add(bt1[i],gbc);
		}
		
			if(i>5){
				GridBagConstraints gbc = new GridBagConstraints();
				gbc.gridx = i-4;
				gbc.gridy = 1;
				gbc.weightx = 20;
				gbc.weighty = 50;
				gbc.insets = new Insets(5, 5, 0, 0);
				gbc.fill = GridBagConstraints.BOTH;
				anjian_1.add(bt1[i],gbc);
			}
		}
		
		jp.updateUI();
		
		}
		
		
	}


